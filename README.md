# NFC TEST

Aplicación para obtener el el estado del adaptador NFC en el dispositivo.

## Git Cheatsheet

_Pull from master_

```
git fetch
git pull origin master
```

_Create new branch_

```
git checkout -b branch_name
git push -u origin branch_name
```

_Commit and push_

```
git add .
git commit -m "message"
git push origin branch_name
```

_Uncommit_

```
- git reset --soft "HEAD^"
```

_Amend last commit and push_

```
git add .
git commit --amend
git push -f
```

_Rebase from master and push to branch, if there are no conflicts, skip steps 2 and 3_

```
git rebase master
{solve conflicts} git add .
git rebase --continue
git push -f
```

_Squash commits into 1 commit, N is number of commits_

```
git rebase -i HEAD~N
{squash commits}
git push -f
```