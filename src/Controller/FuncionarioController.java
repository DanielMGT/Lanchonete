/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.FuncionarioDAOArq;
import Model.FuncionarioModel;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class FuncionarioController {
    static FuncionarioDAOArq dao = new FuncionarioDAOArq();
    static ArrayList<FuncionarioModel> func;
                       
    public static void cadastraFuncionario(FuncionarioModel funcionario){
        func.add(funcionario);
    }   
        public static boolean funcionarioExiste(String mat){
            func = dao.recuperar();
            FuncionarioModel aux;
            int i;
                 for(i = 0; i < func.size(); i++){
                    aux = func.get(i);
                       if(aux.getMatricula() == mat){
                          return true;
                        }
                 }
            return false;       
        }
        public static boolean isNullOrBlank(String s) {
            return (s == null || s.trim().equals(""));
        }
}

