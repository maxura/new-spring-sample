<%--

     [2012] - [2017] Codenvy, S.A.
     All Rights Reserved.

    NOTICE:  All information contained herein is, and remains
    the property of Codenvy S.A. and its suppliers,
    if any.  The intellectual and technical concepts contained
    herein are proprietary to Codenvy S.A.
    and its suppliers and may be covered by U.S. and Foreign Patents,
    patents in process, and are protected by trade secret or copyright law.
    Dissemination of this information or reproduction of this material
    is strictly forbidden unless prior written permission is obtained
    from Codenvy S.A..

--%>
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
