// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.crm.propertiesvalidations.PropertiesValidationGetByObjectTypeIdAndPropertyNameParams
import com.hubspot.sdk.models.crm.propertiesvalidations.PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams
import com.hubspot.sdk.models.crm.propertiesvalidations.PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams
import com.hubspot.sdk.models.crm.propertiesvalidations.PublicPropertyValidationRuleUpdate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PropertiesValidationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByObjectTypeId() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val propertiesValidationServiceAsync = client.crm().propertiesValidations()

        val collectionResponsePublicPropertyValidationRuleMapNoPagingFuture =
            propertiesValidationServiceAsync.getByObjectTypeId("objectTypeId")

        val collectionResponsePublicPropertyValidationRuleMapNoPaging =
            collectionResponsePublicPropertyValidationRuleMapNoPagingFuture.get()
        collectionResponsePublicPropertyValidationRuleMapNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByObjectTypeIdAndPropertyName() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val propertiesValidationServiceAsync = client.crm().propertiesValidations()

        val collectionResponsePublicPropertyValidationRuleNoPagingFuture =
            propertiesValidationServiceAsync.getByObjectTypeIdAndPropertyName(
                PropertiesValidationGetByObjectTypeIdAndPropertyNameParams.builder()
                    .objectTypeId("objectTypeId")
                    .propertyName("propertyName")
                    .build()
            )

        val collectionResponsePublicPropertyValidationRuleNoPaging =
            collectionResponsePublicPropertyValidationRuleNoPagingFuture.get()
        collectionResponsePublicPropertyValidationRuleNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByObjectTypeIdPropertyNameAndRuleType() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val propertiesValidationServiceAsync = client.crm().propertiesValidations()

        val publicPropertyValidationRuleFuture =
            propertiesValidationServiceAsync.getByObjectTypeIdPropertyNameAndRuleType(
                PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.builder()
                    .objectTypeId("objectTypeId")
                    .propertyName("propertyName")
                    .ruleType(
                        PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType
                            .AFTER_DATETIME_DURATION
                    )
                    .build()
            )

        val publicPropertyValidationRule = publicPropertyValidationRuleFuture.get()
        publicPropertyValidationRule.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateByObjectTypeIdPropertyNameAndRuleType() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val propertiesValidationServiceAsync = client.crm().propertiesValidations()

        val future =
            propertiesValidationServiceAsync.updateByObjectTypeIdPropertyNameAndRuleType(
                PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.builder()
                    .objectTypeId("objectTypeId")
                    .propertyName("propertyName")
                    .ruleType(
                        PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams
                            .RuleType
                            .AFTER_DATETIME_DURATION
                    )
                    .publicPropertyValidationRuleUpdate(
                        PublicPropertyValidationRuleUpdate.builder()
                            .addRuleArgument("string")
                            .shouldApplyNormalization(true)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
