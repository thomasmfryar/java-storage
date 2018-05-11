from flask import Flask, flash, redirect, render_template, request, url_for

app = Flask(__name__)
app.secret_key = b'_5#y2L"F4Q8z\n\xec]/'



usernameList = ['admin']

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/login', methods=['GET', 'POST'])
def login():
    error = None
    if request.method == 'POST':
        for usernames in usenameList:
            if request.form['username'] != usernameList(usernames) or request.form['password'] != 'secret':
                error = 'Invalid credentials'
            else:
                flash('You were successfully logged in')
                return redirect(url_for('index'))
            
    return render_template('login.html', error=error)

@app.route('/signup', methods=['GET', 'POST'])
def signUp():
    usernameTaken = None
    if request.method == 'POST':
        usernameList.append(request.form['username'])
        flash('You were successfully signed up')
        return redirect(url_for('index'))
    
        
    return render_template('signUp.html', usernameTaken=usernameTaken)
    

#always the last line of code
if __name__ == "__main__":
    app.run(debug=True)