package metier;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.tools.JavaFileManager.Location;

public class GenerateurFic {

	public void ecrireTruc(String nomDeFichier, ArrayList<metier.Location> desLocations1)  throws IOException {
        DataOutputStream fluxEcriture = new DataOutputStream(new FileOutputStream(nomDeFichier));
        try{
            for(metier.Location l : desLocations1){
                fluxEcriture.writeBytes(l.toString());
            }
        }
        finally{
            fluxEcriture.close();
        }
    }
	
}
