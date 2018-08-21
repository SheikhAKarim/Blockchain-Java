/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myblockchain;

import java.util.ArrayList;

/**
 *
 * @author abdul
 */
public class MyBlockchain {

   
    ArrayList<Block> blockchain = new ArrayList<>();
    
    public static void main(String[] args) 
    {
        String[] genesisTransactions = {"This is a simple Blockchain", "The code of this Blockchain is in Java", "Hold it"};
        Block genesisBlock = new Block(0,genesisTransactions);
        
        String[] block2transactions = {"X is here too", "He has alot of Ripples"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2transactions);
        
        String[] block3transactions = {"Y is here too", "He has alot of Courage"};
        Block block3 = new Block(block2.getBlockHash(), block3transactions);
        
        System.out.println("Genesis Block: "+ genesisBlock.getBlockHash());
        System.out.println("Block 2: "+ block2.getBlockHash());
        System.out.println("Block 3: "+ block3.getBlockHash());
    }
    
}
