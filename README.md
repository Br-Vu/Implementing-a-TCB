# Implementing-a-TCB

This program is designed to show a Trusted Computer Based application.  Users need to sign in with a key that will grant them certain privileges based on said key.  If a user is unable to provide a known key, the program will give them three attempts and then terminate.  If the user provides the appropriate key, they will be presented with a menu to select different options (ie. write file).  If the user tries to execute an action they are not permitted to do, the program will terminate.  If the user is able to perform the action, the screen will print the action that would be allowed to be performed.  

The purpose of this project is to implement a security layer that permits privileges based on identity provided.  It is an implementation of a Mandatory Access Control (MAC) within the realm of Identity and Access Management.

