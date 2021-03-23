package com.assesment.problem1.Services;

import com.assesment.problem1.entities.Lps;
import com.assesment.problem1.exceptions.DuplicateInputException;
import com.assesment.problem1.exceptions.PalindromeNotFoundException;
import com.assesment.problem1.repositories.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class MainServiceImpl implements MainService{
    @Autowired
    private MainRepository mainRepository;

    @Override
    @Transactional
    public void findLongest(String str) {
        String longestPalindrome=find(str);
        Optional<Lps> optionalLps=mainRepository.findById(str);
        if(optionalLps.isPresent()){
            throw new DuplicateInputException("Palindrome for the input string already exists");
        }
        mainRepository.save(new Lps(str,longestPalindrome));
    }

    @Override
    public String getPalindrome(String str) {
        Optional<Lps> optionalLps=mainRepository.findById(str);
        if(optionalLps.isEmpty()){
            throw new PalindromeNotFoundException("Cannot find the palindrome for the given input string in the database");
        }
        return optionalLps.get().getPalindromicSubString();
    }

    // Method to find the longest palindromic substring.
    private String find(String str) {
        int[][] chrArr=new int[str.length()][str.length()];
        for(int i=0;i<chrArr.length;i++){
            chrArr[i][i]=1;
        }
        int maxVal=1;
        int[] pos=new int[]{chrArr.length-1,chrArr.length-1};
        for(int i=chrArr.length;i>=0;i--){
            for(int j=i+1;j<chrArr.length;j++){
                if(str.charAt(i)==str.charAt(j)){
                    if(chrArr[i+1][j-1]==(j-i)-1){
                        chrArr[i][j]=2+chrArr[i+1][j-1];
                        int val=chrArr[i][j];
                        if(val>maxVal){
                            maxVal=val;
                            pos=new int[]{i,j};
                        }
                        continue;
                    }

                }
                chrArr[i][j]=Math.max(chrArr[i+1][j],chrArr[i][j-1]);
            }
        }

        return str.substring(pos[0],pos[1]+1);
    }
}
