// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.marketing.transactional

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.marketing.transactional.SmtpApiTokenRequestEgg
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SmtpTokenServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val smtpTokenServiceAsync = client.marketing().transactional().smtpTokens()

        val smtpApiTokenViewFuture =
            smtpTokenServiceAsync.create(
                SmtpApiTokenRequestEgg.builder()
                    .campaignName("campaignName")
                    .createContact(true)
                    .build()
            )

        val smtpApiTokenView = smtpApiTokenViewFuture.get()
        smtpApiTokenView.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val smtpTokenServiceAsync = client.marketing().transactional().smtpTokens()

        val pageFuture = smtpTokenServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val smtpTokenServiceAsync = client.marketing().transactional().smtpTokens()

        val future = smtpTokenServiceAsync.delete("tokenId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val smtpTokenServiceAsync = client.marketing().transactional().smtpTokens()

        val smtpApiTokenViewFuture = smtpTokenServiceAsync.get("tokenId")

        val smtpApiTokenView = smtpApiTokenViewFuture.get()
        smtpApiTokenView.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resetPassword() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val smtpTokenServiceAsync = client.marketing().transactional().smtpTokens()

        val smtpApiTokenViewFuture = smtpTokenServiceAsync.resetPassword("tokenId")

        val smtpApiTokenView = smtpApiTokenViewFuture.get()
        smtpApiTokenView.validate()
    }
}
