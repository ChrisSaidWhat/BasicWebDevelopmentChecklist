<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>👩🏻‍💻 Web Development Checklist 🧑🏻‍💻</title>
       	<link href="styles.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <header>
            <h1>Web Development Checklist</h1>
        </header>
        <main>
            <form action="CheckCompletionServlet" method="post" target="_blank">
                <fieldset class="first">
                    <legend>HTML:</legend>
                    <div class="alignCenter">
                    <section>
                        <label for="htmlStatus">HTML Completed: </label>
                    </section>
                    <section>
                        <input id="htmlStatus" name="htmlStatus" type="checkbox" value="complete">
                    </section>
                    </div>
                    <section class="imgContainerTop">
                        <img alt="Male web developer at his laptop in the synthwave aesthetic."
                             src="maleWebDeveloper.jpg">
                        <p class="forceDown">CODE ON!</p>
                    </section>
                </fieldset>
                <fieldset class="second">
                    <legend>CSS:</legend>
                    <section class="imgContainerBtm">
                        <p class="forceDown">DREAM ON!</p>
                        <img alt="Female web developer at his laptop in the synthwave aesthetic."
                             src="femaleWebDeveloper.jpg">
                    </section>
                    <div class="alignCenter">
                    <section>
                        <label for="cssStatus">CSS Completed: </label>
                    </section>
                    <section>
                        <input id="cssStatus" name="cssStatus" type="checkbox" value="complete">
                    </section>
                    </div>
                </fieldset>
                <section>
                    	<input type="submit">
                    </section>
            </form>
            <form action="RedirectionAdministratorServlet" method="post" target="_blank" class="secondForm">
            	<div>
            	<label for="seeResources">Show Me Resources!</label>
            	<input id="seeResources" name="seeResources" type="checkbox" value="yes">
            	</div>
            	<input type="submit">
            </form>
        </main>
    </body>
</html>