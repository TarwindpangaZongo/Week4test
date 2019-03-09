************************ Coding Test Week 4 ***********************************
1.  Reverse a string (without using built-in reverse methods) with a time complexity no bigger than O(log(n))
2.  Create a method that will encode a string with the following rules:
           if the char is equal to a, then it turns to a 1, follow this for the following:
                   a = 1
                   e = 2
                    i = 3
                   o = 4
                   u = 5
                   y = ' '  ( a space)
                  ' ' = y
             if the letter is a consonant , it is equal to the previous letter ex:
                  c = b,  h = g , ect
             if it is a number, reverse the number ex,
                 12345 = 54321
                  note, numbers can be enbedded in a word, still must reverse
             if not mentioned above, then it is equal to its actual value

            ex:
            Input String:   ad1234 bye can!
            Output String:  1c4321yb 2yb1m!
