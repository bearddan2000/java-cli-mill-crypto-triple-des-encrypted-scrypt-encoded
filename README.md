# java-cli-mill-crypto-triple-des-encrypted-scrypt-encoded

## Description
Encrypt and decrypt password with 3des
encoded with scrypt.

When storing a password it is best practice
to use a one-way hash such as bcrypt, scrypt,
or argon2.

## Tech stack
- java
- mill
  - 3des
  - bcrypt

## Docker stack
- nightscape/scala-mill

## To run
`sudo ./install.sh -u`

## To stop (optional)
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`
