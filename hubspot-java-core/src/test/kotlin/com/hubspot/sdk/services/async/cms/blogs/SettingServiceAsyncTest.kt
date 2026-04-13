// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.blogs

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.cms.blogs.settings.SettingGetRevisionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SettingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val settingServiceAsync = client.cms().blogs().settings()

        val pageFuture = settingServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val settingServiceAsync = client.cms().blogs().settings()

        val blogFuture = settingServiceAsync.get("blogId")

        val blog = blogFuture.get()
        blog.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRevision() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val settingServiceAsync = client.cms().blogs().settings()

        val blogVersionFuture =
            settingServiceAsync.getRevision(
                SettingGetRevisionParams.builder().blogId("blogId").revisionId("revisionId").build()
            )

        val blogVersion = blogVersionFuture.get()
        blogVersion.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRevisions() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val settingServiceAsync = client.cms().blogs().settings()

        val pageFuture = settingServiceAsync.listRevisions("blogId")

        val page = pageFuture.get()
        page.response().validate()
    }
}
