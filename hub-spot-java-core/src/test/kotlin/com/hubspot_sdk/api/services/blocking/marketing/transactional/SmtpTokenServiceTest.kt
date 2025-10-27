// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.transactional

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.marketing.transactional.SmtpApiTokenRequestEgg
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SmtpTokenServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val smtpTokenService = client.marketing().transactional().smtpTokens()

        val smtpApiTokenView =
            smtpTokenService.create(
                SmtpApiTokenRequestEgg.builder()
                    .campaignName("campaignName")
                    .createContact(true)
                    .build()
            )

        smtpApiTokenView.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val smtpTokenService = client.marketing().transactional().smtpTokens()

        val page = smtpTokenService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val smtpTokenService = client.marketing().transactional().smtpTokens()

        smtpTokenService.delete("tokenId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val smtpTokenService = client.marketing().transactional().smtpTokens()

        val smtpApiTokenView = smtpTokenService.get("tokenId")

        smtpApiTokenView.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun resetPassword() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val smtpTokenService = client.marketing().transactional().smtpTokens()

        val smtpApiTokenView = smtpTokenService.resetPassword("tokenId")

        smtpApiTokenView.validate()
    }
}
