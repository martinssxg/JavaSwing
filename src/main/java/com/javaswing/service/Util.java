/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaswing.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jorge Lescura
 */
public class Util {
        public Date stringToDate(String dataRecebida) throws ParseException{
            SimpleDateFormat formato = new  SimpleDateFormat("dd/MM/yyyy");
            Date dataFormatada = formato.parse(dataRecebida);
            return dataFormatada;
        }
        
        public String dateToString(Date dataRecebida){
            DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = formato.format(dataRecebida);
            return dataFormatada;
        }
        
        public String dateToStringUsa(Date dataRecebida){
            DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String dataFormatada = formato.format(dataRecebida);
            return dataFormatada;
        }
}
