package ru.itis.repositories;

import ru.itis.models.User;
import ru.itis.models.UserRole;

import java.io.*;

public class UsersRepository {
    private String fileName;
    private IdGenerator idGenerator;

    public UsersRepository(String fileName, IdGenerator idGenerator) {
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }

    public void save(User user) {
        try {
            user.setId(idGenerator.generate());
            OutputStream outputStream = new FileOutputStream(fileName, true);
            String userLine = user.toString() + "\n";
            outputStream.write(userLine.getBytes());
            outputStream.close();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public User[] findAll() {
        User users[] = new User[100];
        try{
            Reader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String currentUserLine = bufferedReader.readLine();
            String[] dataUser = new String[9];
            int i = 0;
            while(currentUserLine != null) {
                dataUser = currentUserLine.split("\\|") ;
                String idString = dataUser[0];
                String firstName = dataUser[1];
                String lastname = dataUser[2];
                String ageAsString = dataUser[3];
                String phoneAsString = dataUser[4];
                String email = dataUser[5];
                String login = dataUser[6];
                String password = dataUser[7];
                UserRole role = UserRole.valueOf(dataUser[8]);
                User user = User.builder()
                        .login(login)
                        .password(password)
                        .build();
                if (!firstName.equals("null")){
                    user.setFirstName(firstName);
                }

                if (!lastname.equals("null")){
                    user.setLastName(lastname);
                }

                if (!phoneAsString.equals("null")){
                    user.setPhone(lastname);
                }

                if (!email.equals("null")){
                    user.setEmail(lastname);
                }

                i++;
                currentUserLine = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
        return users;
    }
}
