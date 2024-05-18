package ui;
import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import encode.Encoder;
import files.FileUtils;

public class FileDisplay extends JFrame {

	
	public FileDisplay() {
		
	}
	
	private void createMenu() {
		
			}
	
	private void createControlPanel() {
		
	}
	
	private void createDataPanel() {
		
	}
	
	private void save(String dir) {
		JFileChooser j = new JFileChooser(dir);
		int r = j.showSaveDialog(this);
		 
        // if the user selects a file
        if (r == JFileChooser.APPROVE_OPTION)

        {
            String fileName = j.getSelectedFile().getAbsolutePath();
           
        }
	}
	
	private void load(String dir) {
		JFileChooser j = new JFileChooser(dir);
		int r = j.showOpenDialog(this);
		 
        // if the user selects a file
        if (r == JFileChooser.APPROVE_OPTION)

        {
            String fileName = j.getSelectedFile().getAbsolutePath();
            
            
        }
	}
	
	public static void main(String[] args) {
		
	}
}
