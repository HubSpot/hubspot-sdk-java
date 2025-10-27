// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PropertyValidationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val propertyValidationService = client.crm().propertyValidations()

        val collectionResponsePublicPropertyValidationRuleMapNoPaging =
            propertyValidationService.list("objectTypeId")

        collectionResponsePublicPropertyValidationRuleMapNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val propertyValidationService = client.crm().propertyValidations()

        val collectionResponsePublicPropertyValidationRuleNoPaging =
            propertyValidationService.get(
                PropertyValidationGetParams.builder()
                    .objectTypeId("objectTypeId")
                    .propertyName("propertyName")
                    .build()
            )

        collectionResponsePublicPropertyValidationRuleNoPaging.validate()
    }
}
