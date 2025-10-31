// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PropertyValidationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyValidationServiceAsync = client.crm().propertyValidations()

        val collectionResponsePublicPropertyValidationRuleMapNoPagingFuture =
            propertyValidationServiceAsync.list("objectTypeId")

        val collectionResponsePublicPropertyValidationRuleMapNoPaging =
            collectionResponsePublicPropertyValidationRuleMapNoPagingFuture.get()
        collectionResponsePublicPropertyValidationRuleMapNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyValidationServiceAsync = client.crm().propertyValidations()

        val collectionResponsePublicPropertyValidationRuleNoPagingFuture =
            propertyValidationServiceAsync.get(
                PropertyValidationGetParams.builder()
                    .objectTypeId("objectTypeId")
                    .propertyName("propertyName")
                    .build()
            )

        val collectionResponsePublicPropertyValidationRuleNoPaging =
            collectionResponsePublicPropertyValidationRuleNoPagingFuture.get()
        collectionResponsePublicPropertyValidationRuleNoPaging.validate()
    }
}
