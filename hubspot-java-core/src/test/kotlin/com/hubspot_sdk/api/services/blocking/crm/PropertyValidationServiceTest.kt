// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationGetParams
import com.hubspot_sdk.api.models.crm.propertyvalidations.PublicPropertyValidationRuleUpdate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PropertyValidationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyValidationService = client.crm().propertyValidations()

        val collectionResponsePublicPropertyValidationRuleMapNoPaging =
            propertyValidationService.list("objectTypeId")

        collectionResponsePublicPropertyValidationRuleMapNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyValidationService = client.crm().propertyValidations()

        propertyValidationService.crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
                .builder()
                .objectTypeId("objectTypeId")
                .propertyName("propertyName")
                .ruleType(
                    PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
                        .RuleType
                        .AFTER_DATETIME_DURATION
                )
                .publicPropertyValidationRuleUpdate(
                    PublicPropertyValidationRuleUpdate.builder().addRuleArgument("string").build()
                )
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
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
