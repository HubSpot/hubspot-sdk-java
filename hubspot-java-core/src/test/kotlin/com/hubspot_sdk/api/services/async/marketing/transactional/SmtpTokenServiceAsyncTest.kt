// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.transactional

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.transactional.SmtpApiTokenRequestEgg
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SmtpTokenServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val smtpTokenServiceAsync = client.marketing().transactional().smtpTokens()

        val pageFuture = smtpTokenServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val smtpTokenServiceAsync = client.marketing().transactional().smtpTokens()

        val future = smtpTokenServiceAsync.delete("tokenId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val smtpTokenServiceAsync = client.marketing().transactional().smtpTokens()

        val smtpApiTokenViewFuture = smtpTokenServiceAsync.get("tokenId")

        val smtpApiTokenView = smtpApiTokenViewFuture.get()
        smtpApiTokenView.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun resetPassword() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val smtpTokenServiceAsync = client.marketing().transactional().smtpTokens()

        val smtpApiTokenViewFuture = smtpTokenServiceAsync.resetPassword("tokenId")

        val smtpApiTokenView = smtpApiTokenViewFuture.get()
        smtpApiTokenView.validate()
    }
}
