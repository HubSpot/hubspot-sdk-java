// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.automation.actions

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.automation.actions.revisions.RevisionGetParams
import com.hubspot.sdk.models.automation.actions.revisions.RevisionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RevisionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val revisionService = client.automation().actions().revisions()

        val page =
            revisionService.list(
                RevisionListParams.builder().appId(0).definitionId("definitionId").build()
            )

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val revisionService = client.automation().actions().revisions()

        val publicActionRevision =
            revisionService.get(
                RevisionGetParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .revisionId("revisionId")
                    .build()
            )

        publicActionRevision.validate()
    }
}
