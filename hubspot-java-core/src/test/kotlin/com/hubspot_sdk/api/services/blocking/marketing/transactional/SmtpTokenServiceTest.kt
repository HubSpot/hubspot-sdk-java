// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.transactional

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.marketing.transactional.SmtpApiTokenRequestEgg
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SmtpTokenServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val smtpTokenService = client.marketing().transactional().smtpTokens()

        val page = smtpTokenService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val smtpTokenService = client.marketing().transactional().smtpTokens()

        smtpTokenService.delete("tokenId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val smtpTokenService = client.marketing().transactional().smtpTokens()

        val smtpApiTokenView = smtpTokenService.get("tokenId")

        smtpApiTokenView.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resetPassword() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val smtpTokenService = client.marketing().transactional().smtpTokens()

        val smtpApiTokenView = smtpTokenService.resetPassword("tokenId")

        smtpApiTokenView.validate()
    }
}
