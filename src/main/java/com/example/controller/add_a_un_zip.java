package com.example.controller;


import java.io.File;
import java.util.ArrayList;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

public class add_a_un_zip {
	  
	public add_a_un_zip(){
        try{
        ZipFile archivo = new ZipFile("D:/compresion/ZipTest/Holaaaa.zip");
         ArrayList lista = new ArrayList();
         lista.add(new File("D:/compresion/ZipTest/samples.txt"));
            
         ZipParameters parametros = new ZipParameters();
         
         parametros.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
         parametros.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
         
         archivo.addFiles(lista, parametros);
         
            
        }catch(ZipException e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new add_a_un_zip();
    }
    
}
