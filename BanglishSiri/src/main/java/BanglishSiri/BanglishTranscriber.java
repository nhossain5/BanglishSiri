package BanglishSiri;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

import javax.swing.*;

public class BanglishTranscriber {
	
	public static JFrame jf;
	public static JTextArea jta;

	public static void main(String[] args) throws Exception {
        jf = new JFrame("BanglishSiri");
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jta = new JTextArea();
        jta.setEditable(false);
        JScrollPane jsp = new JScrollPane(jta);
        jf.add(jsp);
        jf.setVisible(true);
        Configuration configuration = new Configuration();
        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        configuration.setDictionaryPath("src\\main\\resources\\PronunciationDictionary.dic");
        configuration.setLanguageModelPath("src\\main\\resources\\LanguageModel.lm");
        try
        {
        	System.setProperty(
                    "freetts.voices",
                    "com.sun.speech.freetts.en.us"
                        + ".cmu_us_kal.KevinVoiceDirectory");
        	Central.registerEngineCentral(
                    "com.sun.speech.freetts"
                    + ".jsapi.FreeTTSEngineCentral");
        	Synthesizer synthesizer
            = Central.createSynthesizer(
                new SynthesizerModeDesc(Locale.US));
        	synthesizer.allocate();
        	synthesizer.resume();
        	LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
        	recognizer.startRecognition(true);
        	SpeechResult speechResult = null;
        	while((speechResult=recognizer.getResult())!=null)
        	{
        		String voiceCommand = speechResult.getHypothesis();
        		if(voiceCommand.equalsIgnoreCase("Open Chrome")||voiceCommand.equalsIgnoreCase("Chrome Kulo")||voiceCommand.equalsIgnoreCase("Chrome Open Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Opening Chrome");
        			Runtime.getRuntime().exec("cmd.exe /c start chrome.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Opening Chrome");
        			synthesizer.speakPlainText(
                            "Opening Chrome", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Close Chrome")||voiceCommand.equalsIgnoreCase("Chrome Bhondho Koro")||voiceCommand.equalsIgnoreCase("Chrome Close Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Closing Chrome");
        			Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Closing Chrome");
        			synthesizer.speakPlainText(
                            "Closing Chrome", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Open Edge")||voiceCommand.equalsIgnoreCase("Edge Kulo")||voiceCommand.equalsIgnoreCase("Edge Open Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Opening Edge");
        			Runtime.getRuntime().exec("cmd.exe /c start msedge.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Opening Edge");
        			synthesizer.speakPlainText(
                            "Opening Edge", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Close Edge")||voiceCommand.equalsIgnoreCase("Edge Bhondho Koro")||voiceCommand.equalsIgnoreCase("Edge Close Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Closing Edge");
        			Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Closing Edge");
        			synthesizer.speakPlainText(
                            "Closing Edge", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Open iTunes")||voiceCommand.equalsIgnoreCase("iTunes Kulo")||voiceCommand.equalsIgnoreCase("iTunes Open Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Opening iTunes");
        			Runtime.getRuntime().exec("cmd.exe /c start itunes.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Opening iTunes");
        			synthesizer.speakPlainText(
                            "Opening iTunes", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Close iTunes")||voiceCommand.equalsIgnoreCase("iTunes Bhondho Koro")||voiceCommand.equalsIgnoreCase("iTunes Close Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Closing iTunes");
        			Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM itunes.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Closing iTunes");
        			synthesizer.speakPlainText(
                            "Closing iTunes", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Open Excel")||voiceCommand.equalsIgnoreCase("Excel Kulo")||voiceCommand.equalsIgnoreCase("Excel Open Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Opening Excel");
        			Runtime.getRuntime().exec("cmd.exe /c start excel.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Opening Excel");
        			synthesizer.speakPlainText(
                            "Opening Excel", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Close Excel")||voiceCommand.equalsIgnoreCase("Excel Bhondho Koro")||voiceCommand.equalsIgnoreCase("Excel Close Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Closing Excel");
        			Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM excel.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Closing Excel");
        			synthesizer.speakPlainText(
                            "Closing Excel", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Open PowerPoint")||voiceCommand.equalsIgnoreCase("PowerPoint Kulo")||voiceCommand.equalsIgnoreCase("PowerPoint Open Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Opening PowerPoint");
        			Runtime.getRuntime().exec("cmd.exe /c start powerpnt.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Opening PowerPoint");
        			synthesizer.speakPlainText(
                            "Opening PowerPoint", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Close PowerPoint")||voiceCommand.equalsIgnoreCase("PowerPoint Bhondho Koro")||voiceCommand.equalsIgnoreCase("PowerPoint Close Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Closing PowerPoint");
        			Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM powerpnt.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Closing PowerPoint");
        			synthesizer.speakPlainText(
                            "Closing PowerPoint", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Open Snipping Tool")||voiceCommand.equalsIgnoreCase("Snipping Tool Kulo")||voiceCommand.equalsIgnoreCase("Snipping Tool Open Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Opening Snipping Tool");
        			Runtime.getRuntime().exec("cmd.exe /c start snippingtool.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Opening Snipping Tool");
        			synthesizer.speakPlainText(
                            "Opening Snipping Tool", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Close Snipping Tool")||voiceCommand.equalsIgnoreCase("Snipping Tool Bhondho Koro")||voiceCommand.equalsIgnoreCase("Snipping Tool Close Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Closing Snipping Tool");
        			Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM snippingtool.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Closing Snipping Tool");
        			synthesizer.speakPlainText(
                            "Closing Snipping Tool", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Open Word")||voiceCommand.equalsIgnoreCase("Word Kulo")||voiceCommand.equalsIgnoreCase("Word Open Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Opening Word");
        			Runtime.getRuntime().exec("cmd.exe /c start winword.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Opening Word");
        			synthesizer.speakPlainText(
                            "Opening Word", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Close Word")||voiceCommand.equalsIgnoreCase("Word Bhondho Koro")||voiceCommand.equalsIgnoreCase("Word Close Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Closing Word");
        			Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM winword.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Closing Word");
        			synthesizer.speakPlainText(
                            "Closing Word", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Open Internet Explorer")||voiceCommand.equalsIgnoreCase("Internet Explorer Kulo")||voiceCommand.equalsIgnoreCase("Internet Explorer Open Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Opening Internet Explorer");
        			Runtime.getRuntime().exec("cmd.exe /c start iexplore.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Opening Internet Explorer");
        			synthesizer.speakPlainText(
                            "Opening Internet Explorer", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Close Internet Explorer")||voiceCommand.equalsIgnoreCase("Internet Explorer Bhondho Koro")||voiceCommand.equalsIgnoreCase("Internet Explorer Close Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Closing Internet Explorer");
        			Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM iexplore.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Closing Internet Explorer");
        			synthesizer.speakPlainText(
                            "Closing Internet Explorer", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Open Notepad")||voiceCommand.equalsIgnoreCase("Notepad Kulo")||voiceCommand.equalsIgnoreCase("Notepad Open Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Opening Notepad");
        			Runtime.getRuntime().exec("cmd.exe /c start notepad.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Opening Notepad");
        			synthesizer.speakPlainText(
                            "Opening Notepad", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Close Notepad")||voiceCommand.equalsIgnoreCase("Notepad Bhondho Koro")||voiceCommand.equalsIgnoreCase("Notepad Close Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Closing Notepad");
        			Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM notepad.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Closing Notepad");
        			synthesizer.speakPlainText(
                            "Closing Notepad", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Open Paint")||voiceCommand.equalsIgnoreCase("Paint Kulo")||voiceCommand.equalsIgnoreCase("Paint Open Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Opening Paint");
        			Runtime.getRuntime().exec("cmd.exe /c start mspaint.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Opening Paint");
        			synthesizer.speakPlainText(
                            "Opening Paint", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Close Paint")||voiceCommand.equalsIgnoreCase("Paint Bhondho Koro")||voiceCommand.equalsIgnoreCase("Paint Close Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Closing Paint");
        			Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM mspaint.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Closing Paint");
        			synthesizer.speakPlainText(
                            "Closing Paint", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Open Windows Media Player")||voiceCommand.equalsIgnoreCase("Windows Media Player Kulo")||voiceCommand.equalsIgnoreCase("Windows Media Player Open Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Opening Windows Media Player");
        			Runtime.getRuntime().exec("cmd.exe /c start wmplayer.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Opening Windows Media Player");
        			synthesizer.speakPlainText(
                            "Opening Windows Media Player", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Close Windows Media Player")||voiceCommand.equalsIgnoreCase("Windows Media Player Bhondho Koro")||voiceCommand.equalsIgnoreCase("Windows Media Player Close Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Closing Windows Media Player");
        			Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM wmplayer.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Closing Windows Media Player");
        			synthesizer.speakPlainText(
                            "Closing Windows Media Player", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Open Wordpad")||voiceCommand.equalsIgnoreCase("Wordpad Kulo")||voiceCommand.equalsIgnoreCase("Wordpad Open Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Opening Wordpad");
        			Runtime.getRuntime().exec("cmd.exe /c start wordpad.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Opening Wordpad");
        			synthesizer.speakPlainText(
                            "Opening Wordpad", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Close Wordpad")||voiceCommand.equalsIgnoreCase("Wordpad Bhondho Koro")||voiceCommand.equalsIgnoreCase("Wordpad Close Koro"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Closing Wordpad");
        			Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM wordpad.exe");
                    addLine("User Input: " + voiceCommand);
        			addLine("Closing Wordpad");
        			synthesizer.speakPlainText(
                            "Closing Wordpad", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("What is the time")||voiceCommand.equalsIgnoreCase("Koita Baje")||voiceCommand.equalsIgnoreCase("Time ta ki"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			SimpleDateFormat timeFormatter= new SimpleDateFormat("HH:mm:ss z");
        			Date date = new Date(System.currentTimeMillis());
        			System.out.println("The time is: " + timeFormatter.format(date));
                    addLine("User Input: " + voiceCommand);
        			addLine("The time is: " + timeFormatter.format(date));
        			synthesizer.speakPlainText(
        					"The time is: " + timeFormatter.format(date), null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("What is the date")||voiceCommand.equalsIgnoreCase("Koto Tarik")||voiceCommand.equalsIgnoreCase("Date ta ki"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			Date date = new Date();
        			SimpleDateFormat dateFormatter = new SimpleDateFormat("MM-dd-yyyy");
        			System.out.println("The date is: " + dateFormatter.format(date));
                    addLine("User Input: " + voiceCommand);
        			addLine("The date is: " + dateFormatter.format(date));
        			synthesizer.speakPlainText(
        					"The date is: " + dateFormatter.format(date), null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        		}
        		else if(voiceCommand.equalsIgnoreCase("Bye Banglish"))
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("See you later!");
        			addLine("User Input: " + voiceCommand);
        			addLine("See you later!");
        			synthesizer.speakPlainText(
        					"See you later!", null);
                    synthesizer.waitEngineState(
                            Synthesizer.QUEUE_EMPTY);
        			recognizer.stopRecognition();
        			synthesizer.deallocate();
        			System.exit(0);
        		}
        		else
        		{
        			System.out.println("User Input: " + voiceCommand);
        			System.out.println("Sorry, I could not understand, can you please repeat yourself");
                    addLine("User Input: " + voiceCommand);
        			addLine("Sorry, I could not understand, can you please repeat yourself");
        		}
        	}
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
	
	public static void addLine(String line) {
        if (!jta.getText().equals("")) {
            jta.append("\n");
        }
        jta.append(line);
    }
}