// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DomainServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val domainService = client.cms().domains()

        val page = domainService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val domainService = client.cms().domains()

        val domain = domainService.get("domainId")

        domain.validate()
    }
}
