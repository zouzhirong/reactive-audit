package com.octo.reactive.audit.java.io;

import com.octo.reactive.audit.lib.FileAuditReactiveException;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by pprados on 06/05/14.
 */
public abstract class AuditedInputStreamTest extends InputStreamTest
{
// FIXME
//	@Override
//	@Test(expected=AuditReactiveException.class)
//	public void New() throws IOException
//	{
//		super.New();
//	}

	@Override
	@Test(expected = FileAuditReactiveException.class)
	public void available() throws IOException
	{
		super.available();
	}

	@Override
	@Test(expected = FileAuditReactiveException.class)
	public void close() throws IOException
	{
		super.close();
	}

	@Override
	@Test(expected = FileAuditReactiveException.class)
	public void read() throws IOException
	{
		super.read();
	}

	@Override
	@Test(expected = FileAuditReactiveException.class)
	public void read_B() throws IOException
	{
		super.read_B();
	}

	@Override
	@Test(expected = FileAuditReactiveException.class)
	public void read_Bii() throws IOException
	{
		super.read_Bii();
	}

	@Override
	@Test(expected = FileAuditReactiveException.class)
	public void skip() throws IOException
	{
		super.skip();
	}

}