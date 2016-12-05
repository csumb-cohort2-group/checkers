<html>
<body>
   <div class="create-username">
      <h2>Create your username for this session to get started.</h2>
      <% out.print(request.getAttribute("error") == null
          ? ""
          : request.getAttribute("error")); %>
      <form method="POST" action="CreateUsername">
         <input type=text name="username" />
         <input type=submit name="submit" value="Proceed" />
      </form>
   </div>
</body>
</html>
