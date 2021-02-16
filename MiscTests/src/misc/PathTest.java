package misc;

import java.util.EnumSet;
import java.util.List;

public class PathTest {

	public static void main(String[] args) {
		List<String> paths = WindowsCmdShell.instance().services().findService("tomcat",
				EnumSet.of(Services.Field.PathName));

		boolean success = false;

		for (String path : paths) {
			Matcher matcher = PATH_SERVICE_PATTERN.matcher(path);
			if (matcher.matches()) {
				Path executablePath = Paths.get(matcher.group(1));
				if (Files.exists(executablePath)) {
					Path home = executablePath.getParent().getParent();
					write(TomcatFinding.HOME_DIRECTORY, home.toFile().getCanonicalPath());
					success = true;
				}
			}
		}
	}
	
}
