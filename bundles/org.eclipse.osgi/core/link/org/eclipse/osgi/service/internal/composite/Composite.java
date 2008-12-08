package org.eclipse.osgi.service.internal.composite;

import org.eclipse.osgi.framework.adaptor.ClassLoaderDelegate;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.osgi.framework.BundleException;
import org.osgi.service.framework.LinkBundle;

public interface Composite {
	public void updateContent() throws BundleException;

	public void refreshContent(boolean synchronously);

	public boolean resolveContent();

	public BundleDescription getCompositeDescription();

	public ClassLoaderDelegate getDelegate();

	public void started(LinkBundle parent);

	public void stopped(LinkBundle parent);
}
