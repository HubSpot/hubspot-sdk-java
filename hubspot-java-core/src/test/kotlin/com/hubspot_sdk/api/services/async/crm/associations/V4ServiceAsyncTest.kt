// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.PublicMergeInput
import com.hubspot_sdk.api.models.crm.associations.v4.V4MergeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V4ServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun merge() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val v4ServiceAsync = client.crm().associations().v4()

        val simplePublicObjectFuture =
            v4ServiceAsync.merge(
                V4MergeParams.builder()
                    .objectType("objectType")
                    .publicMergeInput(
                        PublicMergeInput.builder()
                            .objectIdToMerge("objectIdToMerge")
                            .primaryObjectId("primaryObjectId")
                            .build()
                    )
                    .build()
            )

        val simplePublicObject = simplePublicObjectFuture.get()
        simplePublicObject.validate()
    }
}
