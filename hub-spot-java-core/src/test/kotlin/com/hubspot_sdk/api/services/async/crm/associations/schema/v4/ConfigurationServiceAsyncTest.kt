// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.schema.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchInputPublicAssociationDefinitionConfigurationCreateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchInputPublicAssociationDefinitionConfigurationUpdateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchInputPublicAssociationSpec
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationDefinitionConfigurationCreateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationDefinitionConfigurationUpdateRequest
import com.hubspot_sdk.api.models.crm.associations.schema.v4.PublicAssociationSpec
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchCreateByObjectTypesParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchDeleteByObjectTypesParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchUpdateByObjectTypesParams
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
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val configurationServiceAsync = client.crm().associations().schema().v4().configurations()

        val collectionResponsePublicAssociationDefinitionUserConfigurationNoPagingFuture =
            configurationServiceAsync.list()

        val collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
            collectionResponsePublicAssociationDefinitionUserConfigurationNoPagingFuture.get()
        collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchCreateByObjectTypes() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val configurationServiceAsync = client.crm().associations().schema().v4().configurations()

        val batchResponsePublicAssociationDefinitionUserConfigurationFuture =
            configurationServiceAsync.batchCreateByObjectTypes(
                ConfigurationBatchCreateByObjectTypesParams.builder()
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
    fun batchDeleteByObjectTypes() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val configurationServiceAsync = client.crm().associations().schema().v4().configurations()

        val future =
            configurationServiceAsync.batchDeleteByObjectTypes(
                ConfigurationBatchDeleteByObjectTypesParams.builder()
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

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUpdateByObjectTypes() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val configurationServiceAsync = client.crm().associations().schema().v4().configurations()

        val batchResponsePublicAssociationDefinitionConfigurationUpdateResultFuture =
            configurationServiceAsync.batchUpdateByObjectTypes(
                ConfigurationBatchUpdateByObjectTypesParams.builder()
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
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val configurationServiceAsync = client.crm().associations().schema().v4().configurations()

        val collectionResponsePublicAssociationDefinitionUserConfigurationNoPagingFuture =
            configurationServiceAsync.getByObjectTypes(
                ConfigurationGetByObjectTypesParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .build()
            )

        val collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
            collectionResponsePublicAssociationDefinitionUserConfigurationNoPagingFuture.get()
        collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging.validate()
    }
}
