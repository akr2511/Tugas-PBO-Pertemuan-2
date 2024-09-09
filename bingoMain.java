/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lagubingo;

/**
 *
 * @author akriz
 */
public class bingoMain {
    public static void main(String[] args){
    
        bingo bingo1 = new bingo("B", "I", "N", "G", "O");
        bingo bingo2 = new bingo("(Clap)", "I", "N", "G", "O");
        bingo bingo3 = new bingo("(Clap)", "(Clap)", "N", "G", "O");
        bingo bingo4 = new bingo("(Clap)", "(Clap)", "(Clap)", "G", "O");
        bingo bingo5 = new bingo("(Clap)", "(Clap)", "(Clap)", "(Clap)", "O");
        bingo bingo6 = new bingo("(Clap)", "(Clap)", "(Clap)", "(Clap)", "(Clap)");
        
        bingo1.nyanyi();
        bingo2.nyanyi();
        bingo3.nyanyi();
        bingo4.nyanyi();
        bingo5.nyanyi();
        bingo6.nyanyi();


    }
}
