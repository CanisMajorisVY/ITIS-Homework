package utils;

import java.util.Scanner;

/**
 * Created by Mihail on 14.02.2017.
 */
public class ConsoleUserInteractor implements UserInteractor {
    private Scanner sc;

    public ConsoleUserInteractor () throws UserInteractorException {
        sc = new Scanner(System.in);
    }


    @Override
    public String readCommand() throws UserInteractorReadException {
        String command;
        command = sc.nextLine();

        if(command == null) {
            throw new UserInteractorReadException("Строка не введена");
        }

        return command;
    }

    @Override
    public void print(String output) throws UserInteractorWriteException{
        try {
            System.out.print(output);
        } catch (Exception ex) {
            throw new UserInteractorWriteException("Ошибка вывода");
        }
    }
}
