/* JNITasks: Ant tasks for JNI projects.
 * Copyright (C) 2013-2018 Alexander Barker.  All Rights Received.
 * https://github.com/kwhat/jnitasks/
 *
 * JNITasks is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JNITasks is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jnitasks.test.autotools;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;

public class VerboseLogger extends DefaultLogger {
	private String lastMessage;
    
	public VerboseLogger() {
		super();
        
		setMessageOutputLevel(Project.MSG_INFO);
		setOutputPrintStream(System.out);
		setErrorPrintStream(System.err);
	}
    
	@Override
	protected void log(String message) {
		this.lastMessage = message;

		//System.out.println(message);
	}
	
	public String getLastMessgae() {
		return this.lastMessage;
	}
}
