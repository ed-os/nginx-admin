<%@include file="taglibs.jsp"%>
<html:view>

	<html:nav>
		<html:container>
			<html:brand label="{brand}" url="/"></html:brand>
			<html:menuButton icon="option-vertical" align="right">
				<html:menuItem url="#" label="${ userSession.user.login }" icon="user"></html:menuItem>
				<html:menuSeparator></html:menuSeparator>
				<html:menuItem target="content" url="/settings/home" icon="cog" label="{settings}"></html:menuItem>
				<html:menuItem url="/user/logout" icon="log-out" label="{logout}"></html:menuItem>
			</html:menuButton>
		</html:container>
	</html:nav>

	<html:container>
		<html:block>
			<html:iframe url="/admin/dashboard" name="content"></html:iframe>
		</html:block>
	</html:container>
</html:view>