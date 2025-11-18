// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.schema.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchInputPublicAssociationDefinitionConfigurationCreateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchInputPublicAssociationDefinitionConfigurationUpdateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchInputPublicAssociationSpec
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationDefinitionConfigurationCreateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationDefinitionConfigurationUpdateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationSpec
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchUpdateParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationGetByObjectTypesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConfigurationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val configurationServiceAsync = client.crm().associations().schema().v4().configurations()

        val collectionResponsePublicAssociationDefinitionUserConfigurationFuture =
            configurationServiceAsync.list()

        val collectionResponsePublicAssociationDefinitionUserConfiguration =
            collectionResponsePublicAssociationDefinitionUserConfigurationFuture.get()
        collectionResponsePublicAssociationDefinitionUserConfiguration.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchCreate() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val configurationServiceAsync = client.crm().associations().schema().v4().configurations()

        val batchResponsePublicAssociationDefinitionUserConfigurationFuture =
            configurationServiceAsync.batchCreate(
                ConfigurationBatchCreateParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociationDefinitionConfigurationCreateRequest(
                        BatchInputPublicAssociationDefinitionConfigurationCreateRequest.builder()
                            .addInput(
                                PublicAssociationDefinitionConfigurationCreateRequest.builder()
                                    .category(
                                        PublicAssociationDefinitionConfigurationCreateRequest
                                            .Category
                                            .HUBSPOT_DEFINED
                                    )
                                    .maxToObjectIds(0)
                                    .typeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val batchResponsePublicAssociationDefinitionUserConfiguration =
            batchResponsePublicAssociationDefinitionUserConfigurationFuture.get()
        batchResponsePublicAssociationDefinitionUserConfiguration.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchDelete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val configurationServiceAsync = client.crm().associations().schema().v4().configurations()

        val batchResponseVoidFuture =
            configurationServiceAsync.batchDelete(
                ConfigurationBatchDeleteParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociationSpec(
                        BatchInputPublicAssociationSpec.builder()
                            .addInput(
                                PublicAssociationSpec.builder()
                                    .category("category")
                                    .typeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val batchResponseVoid = batchResponseVoidFuture.get()
        batchResponseVoid.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUpdate() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val configurationServiceAsync = client.crm().associations().schema().v4().configurations()

        val batchResponsePublicAssociationDefinitionConfigurationUpdateResultFuture =
            configurationServiceAsync.batchUpdate(
                ConfigurationBatchUpdateParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociationDefinitionConfigurationUpdateRequest(
                        BatchInputPublicAssociationDefinitionConfigurationUpdateRequest.builder()
                            .addInput(
                                PublicAssociationDefinitionConfigurationUpdateRequest.builder()
                                    .category(
                                        PublicAssociationDefinitionConfigurationUpdateRequest
                                            .Category
                                            .HUBSPOT_DEFINED
                                    )
                                    .maxToObjectIds(0)
                                    .typeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val batchResponsePublicAssociationDefinitionConfigurationUpdateResult =
            batchResponsePublicAssociationDefinitionConfigurationUpdateResultFuture.get()
        batchResponsePublicAssociationDefinitionConfigurationUpdateResult.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getByObjectTypes() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val configurationServiceAsync = client.crm().associations().schema().v4().configurations()

        val collectionResponsePublicAssociationDefinitionUserConfigurationFuture =
            configurationServiceAsync.getByObjectTypes(
                ConfigurationGetByObjectTypesParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .build()
            )

        val collectionResponsePublicAssociationDefinitionUserConfiguration =
            collectionResponsePublicAssociationDefinitionUserConfigurationFuture.get()
        collectionResponsePublicAssociationDefinitionUserConfiguration.validate()
    }
}
