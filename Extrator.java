import java.io.*;
import java.net.*;

public class Extrator {	
	Uri u = new Uri();
	
	public Extrator(String urlt) {
		u.setUrlt(urlt);
	
				boolean x = false;
				int cont = 0;
				String texto = null;				
				URL url;
		        InputStream is = null;
		        BufferedReader br;
		        String line; {
		       

				try {			    		        	
		            url = new URL(u.getUrlt());
		            is = url.openStream();  // throws an IOException
		            br = new BufferedReader(new InputStreamReader(is));
		           
		            
		            while ((line = br.readLine()) != null) {		        		            		      
		            	if (x) {
		            	
		            	x = false;
		            		if (cont > 1 && cont <= 9) {
		            			if (cont == 2) {
		            				texto = line.trim();
		            				u.setPosicao(texto);
		            			}
		            			if (cont == 3) {
		            				texto = line.trim();
		            				u.setPais(texto);
		            			}
		            			if (cont == 4) {
		            				texto = line.trim();
		            				u.setUni(texto);
		            			}
		            			if (cont == 5) {
		            				texto = line.trim();
		            				u.setData(texto);
		            			}
		            			if (cont == 6) {
		            				texto = line.trim();
		            				u.setPonto(texto);
		            			}
		            			if (cont == 7) {
		            				texto = line.trim();
		            				u.setRes(texto);
		            			}
		            			if (cont == 8) {
		            				texto = line.trim();
		            				u.setTent(texto);
		            			}
		            			if (cont == 9) {
		            				texto = line.trim();
		            				u.setSubmissao(texto);
		            			}
		            		}
		            		cont++;
		            	}	
		            	
		            	
		            	if(line.contains("Posição")) {
		                    //System.out.println(line.trim());
		                	x = true;
		                }
		            		
		            	if(line.contains("País")) {
		                    //System.out.println(line.trim());
		                	x = true;
		                
		            	}
		            	if(line.contains("Universidade")) {
		            		// System.out.println(line.trim());
		                	x = true;
		            	}
		            	if(line.contains("Desde")) {
		            		// System.out.println(line.trim());
		                	x = true;
		            	}
		            	
		            	if(line.contains("Pontos")) {
		            		//  System.out.println(line.trim());
		                	x = true;
		            	}	
		            	
		            	if(line.contains("Submissões")) {
		            		// System.out.println(line.trim());
		                	x = true;
		            	}
		                
		              	if(line.contains("Tentado")) {
		                		//  System.out.println(line.trim());
		              		x = true;
		              	}
		                    	
		                if(line.contains("Resolvido")) {
		                   		// System.out.println(line.trim());
		                   	x = true;
		              	}
		                
		            }   	
		        } catch (MalformedURLException mue) {
		             mue.printStackTrace();
		        } catch (IOException ioe) {
		             ioe.printStackTrace();
		        } finally {
		            try {
		                if (is != null) is.close();
		            } catch (IOException ioe) {
		                //exception
		            }
		        }
		        
		        System.out.println(u);     
		}

	}		        
}