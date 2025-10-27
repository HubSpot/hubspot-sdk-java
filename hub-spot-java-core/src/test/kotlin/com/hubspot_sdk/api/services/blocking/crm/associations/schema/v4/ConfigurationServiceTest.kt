// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
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
internal class ConfigurationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val configurationService = client.crm().associations().schema().v4().configurations()

        val collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
            configurationService.list()

        collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchCreateByObjectTypes() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val configurationService = client.crm().associations().schema().v4().configurations()

        val batchResponsePublicAssociationDefinitionUserConfiguration =
            configurationService.batchCreateByObjectTypes(
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

        batchResponsePublicAssociationDefinitionUserConfiguration.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchDeleteByObjectTypes() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val configurationService = client.crm().associations().schema().v4().configurations()

        configurationService.batchDeleteByObjectTypes(
            ConfigurationBatchDeleteByObjectTypesParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .batchInputPublicAssociationSpec(
                    BatchInputPublicAssociationSpec.builder()
                        .addInput(
                            PublicAssociationSpec.builder().category("category").typeId(0).build()
                        )
                        .build()
                )
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUpdateByObjectTypes() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val configurationService = client.crm().associations().schema().v4().configurations()

        val batchResponsePublicAssociationDefinitionConfigurationUpdateResult =
            configurationService.batchUpdateByObjectTypes(
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

        batchResponsePublicAssociationDefinitionConfigurationUpdateResult.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getByObjectTypes() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val configurationService = client.crm().associations().schema().v4().configurations()

        val collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
            configurationService.getByObjectTypes(
                ConfigurationGetByObjectTypesParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .build()
            )

        collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging.validate()
    }
}
