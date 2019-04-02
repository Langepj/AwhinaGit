# Awhina Git Workshop

## Setting Up Git
1. GOTO: https://git-scm.com/
2. Install for your operating system
3. Setup Git Bash if on windows
4. GOTO: https://github.com/ (You are probably there if you are reading this)
5. Create an account

#### In terminal/Git Bash:
	6. git config user.name "FIRST_NAME LAST_NAME"
	7. git config user.email "MY_NAME@example.com"
*You may want to set up SSH but this is out of the scope of the workshop*
(https://help.github.com/en/articles/connecting-to-github-with-ssh)
## Fork the Repository
8. Click the fork button at the top to create your own copy of the repository on your Github account

## Clone the Repository
9. Click the clone button at the top and copy the URL

#### In terminal/Git Bash:
	10. git clone <pasted-url-here>
11. Have a look around, note the git ignore file which records filetypes and directories not to be kept.

## Your First Commit
12. In the file named 'attendance.txt' add your own details
13. Save your changes

#### In terminal/Git Bash:
	14. navigate to the project directory
	15. git add <path-to>/attendance.txt
	16. git commit -m "Added details to attendance"
	17. git push

## Open a pull request
18. GOTO: https://github.com/Langepj/AwhinaGit
19. Click the pull request Button
20. Open a pull request from your master branch  to the upstream branch (Mine)

## Branching and Merging
This is the most important part for keeping your work safe day to day.
### Creating a new branch
#### In terminal/Git Bash:
		21. navigate to the project directory
		22. git checkout -b <your-new-branch-name>
Now you are in a seperate branch, whatever you do here cannot affect your master branch
Try adding one of the factorial implementations, once you have:
#### In terminal/Git Bash:
	23. git commit -m "<meaningful-message-here>"
	24. git checkout master
Now you are back in your master branch, you will note that the changes you made aren't here.
#### In terminal/Git Bash:
	25. git merge <name-of-your-branch>
You will see your changes are now in master you will note there are no pending changes as a merge creates a commit
#### In terminal/Git Bash:
	26. git status
Now push your changes to remote:
#### In terminal/Git Bash:
	27. git push

Have play and get comfortable, and ask any questions you need to!

