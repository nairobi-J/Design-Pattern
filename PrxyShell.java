import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class PrxyShell implements Terminal {
    private List<String> SpecialCommand;
    private PowerShell powershell;
    public PrxyShell() {
        powershell = new PowerShell();
        SpecialCommand = new ArrayList<>();
        SpecialCommand.add("rm -rf"); //only admin can do
    }
    @Override
    public void run(String command, String user)
    {
        if(SpecialCommand.contains(command) && user == "user")
        {
            System.out.println("Error while Running Command " + command);
        }
        else{
            powershell.run(command,user);
        }
    }
}
