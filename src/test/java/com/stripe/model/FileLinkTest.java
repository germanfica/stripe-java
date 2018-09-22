package com.stripe.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.FileLink;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class FileLinkTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/file_links/link_123");
    final FileLink fileLink = ApiResource.GSON.fromJson(data, FileLink.class);
    assertNotNull(fileLink);
    assertNotNull(fileLink.getId());
    assertEquals("file_link", fileLink.getObject());
    assertNull(fileLink.getFileObject());
  }

  @Test
  public void testDeserializeExpanded() throws Exception {
    final String[] expansions = {
      "file",
    };
    final String data = getFixture("/v1/file_links/link_123", expansions);
    final FileLink fileLink = ApiResource.GSON.fromJson(data, FileLink.class);
    assertNotNull(fileLink);
    final File file = fileLink.getFileObject();
    assertNotNull(file);
    assertNotNull(file.getId());
    assertEquals(fileLink.getFile(), file.getId());
  }
}
