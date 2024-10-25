<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Users</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100">

<header class="bg-gray-800 py-4 shadow-md">
    <div class="max-w-7xl mx-auto px-4">
        <h1 class="text-2xl font-bold text-white">User Management</h1>
    </div>
</header>

<section class="max-w-7xl mx-auto mt-8 px-4">
    <div class="bg-white shadow-lg rounded-lg overflow-hidden">

        <div class="bg-gray-100 px-6 py-4">
            <h2 class="text-lg font-semibold text-gray-700">Users List</h2>
        </div>

        <div class="overflow-x-auto">
            <table class="min-w-full table-auto divide-y divide-gray-200">
                <thead class="bg-gray-50">
                <tr>
                    <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase">ID</th>
                    <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase">First Name</th>
                    <th class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase">Last Name</th>
                </tr>
                </thead>

                <tbody class="divide-y divide-gray-200 bg-white">
                <c:forEach var="member" items="${members}">
                    <tr class="hover:bg-gray-50">
                        <td class="px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900">${member.id}</td>
                        <td class="px-6 py-4 whitespace-nowrap text-sm text-gray-500">${member.firstName}</td>
                        <td class="px-6 py-4 whitespace-nowrap text-sm text-gray-500">${member.lastName}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

    </div>
</section>

</body>
</html>
