<html>
  <body bgcolor="white">
    <div style="font-size: 120%; color: #1a53ff">
      <span>Enter number: </span><br />
      <form method="post" action="guess">
        <input type=text size="5" name="numGuess" >
        <input type=submit name="submit" value="Ok">
      </form>
    </div>
    <div>
      <%
          {
            java.lang.String attempt = (java.lang.String)request.getAttribute("num");   
      %>
      <span><%=attempt%></span>
      <%
          }
      %>
    </div>
  </body>
</html>
