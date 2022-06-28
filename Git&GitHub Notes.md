#### Git 

[Install Git Software from here](https://git-scm.com)

##### Important Terms
- **Repository**
  - Repository is the place where all the project related files reside.
  
- **Commit**
  - Whenever the project is saved, it means that a commit has happened.</br>
    You can always revert back to particular commit in the future.
    
##### Primary Configuration of git (local System)
- Where do you run commands on git ?
  - If you are on Windows, you can open shell and work with git
  - if you are on Mac or Linux, you can use terminal
- Check the version of git
  - git --version
- You have to tell git who you are (Name)
  - git config --global user.name "Your Name"
- To Check which name is already set
  - git config user.name
- You have to tell git what your email id is
  - git config --global user.email "youremail@id"
- To check which email is set
  - git config user.email
  
- To intialize a Repository ( in the working directory - Project), you need to run the following command</br>
  You will generally be running the following command for only once through the entire lifecycle of
  the project
  - git init
  
- You developed a feature in a project and you want to save the project as a version in the 
  ```Repository```. You need to save the project by following the steps below
    1. Take all the files that you want to save from the ```working directory``` to the ```staging area```
      - Working directory - is the place where all you project related files along with .git folder resides.
      - Staging area - This is the place where all the about to be commited files will reside. </br>
      - git add <File_name> <file_name2> </br>
      - git add .</br>
    2. Now you can run ```git commit``` command to save the files to repository.
      - git commit -m "The short message"
    3. what if you want to check the status of all the files
      - git status
    4. if you want to remove a file that is added to staging area!
        - git rm --cached fileName
    5. if you want to check the log (history) of the commits happened on a repository
        - git log
        - git log --oneline
        - git log --reverse
        - git log -5 

    6. To Move back and forth among the commits
        - git checkout <Commit ID>
  
  DVS - Distributed Version Control System
  CVS - Centralized Version Control System
    

  
