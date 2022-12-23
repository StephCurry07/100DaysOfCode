def reverseParentheses(s):
    while '(' in s:
        posopen=s.rfind('(')
        posclose=s.find(')',posopen+1)
        s=s[:posopen]+s[posopen+1:posclose][::-1]+s[posclose+1:]
    return s;

string='a(bcdefghijkl(mno)p)q'
print(string)
print(reverseParentheses(string))