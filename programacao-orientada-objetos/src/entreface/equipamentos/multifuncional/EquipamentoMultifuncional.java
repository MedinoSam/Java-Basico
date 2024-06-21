package entreface.equipamentos.multifuncional;

import entreface.equipamentos.impressora.Impressora;
import entreface.equipamentos.copiadora.Copiadora;
import entreface.equipamentos.digitalizadora.Digitalizadora;


public class EquipamentoMultifuncional implements Impressora, Digitalizadora, Copiadora {
    
    public void copiar() {
        System.out.println("COPIANDO");
    }

 
    public void imprimir() {
        System.out.println("IMPRIMINDO");
    }

  
    public void digitalizar() {
        System.out.println("DIGITALIZANDO");
        
    }

}
