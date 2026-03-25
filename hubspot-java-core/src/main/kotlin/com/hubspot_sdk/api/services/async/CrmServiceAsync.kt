// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.AppUninstallServiceAsync
import com.hubspot_sdk.api.services.async.crm.AssociationServiceAsync
import com.hubspot_sdk.api.services.async.crm.AssociationsSchemaServiceAsync
import com.hubspot_sdk.api.services.async.crm.DealSplitServiceAsync
import com.hubspot_sdk.api.services.async.crm.ExportServiceAsync
import com.hubspot_sdk.api.services.async.crm.ExtensionServiceAsync
import com.hubspot_sdk.api.services.async.crm.ImportServiceAsync
import com.hubspot_sdk.api.services.async.crm.LimitServiceAsync
import com.hubspot_sdk.api.services.async.crm.ListServiceAsync
import com.hubspot_sdk.api.services.async.crm.ObjectLibraryServiceAsync
import com.hubspot_sdk.api.services.async.crm.ObjectSchemaServiceAsync
import com.hubspot_sdk.api.services.async.crm.ObjectServiceAsync
import com.hubspot_sdk.api.services.async.crm.OwnerServiceAsync
import com.hubspot_sdk.api.services.async.crm.PipelineServiceAsync
import com.hubspot_sdk.api.services.async.crm.PropertiesValidationServiceAsync
import com.hubspot_sdk.api.services.async.crm.PropertyServiceAsync
import java.util.function.Consumer

interface CrmServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrmServiceAsync

    fun appUninstalls(): AppUninstallServiceAsync

    fun associations(): AssociationServiceAsync

    fun associationsSchema(): AssociationsSchemaServiceAsync

    fun dealSplits(): DealSplitServiceAsync

    fun exports(): ExportServiceAsync

    fun extensions(): ExtensionServiceAsync

    fun imports(): ImportServiceAsync

    fun limits(): LimitServiceAsync

    fun lists(): ListServiceAsync

    fun objectLibrary(): ObjectLibraryServiceAsync

    fun objectSchemas(): ObjectSchemaServiceAsync

    fun objects(): ObjectServiceAsync

    fun owners(): OwnerServiceAsync

    fun pipelines(): PipelineServiceAsync

    fun properties(): PropertyServiceAsync

    fun propertiesValidations(): PropertiesValidationServiceAsync

    /** A view of [CrmServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrmServiceAsync.WithRawResponse

        fun appUninstalls(): AppUninstallServiceAsync.WithRawResponse

        fun associations(): AssociationServiceAsync.WithRawResponse

        fun associationsSchema(): AssociationsSchemaServiceAsync.WithRawResponse

        fun dealSplits(): DealSplitServiceAsync.WithRawResponse

        fun exports(): ExportServiceAsync.WithRawResponse

        fun extensions(): ExtensionServiceAsync.WithRawResponse

        fun imports(): ImportServiceAsync.WithRawResponse

        fun limits(): LimitServiceAsync.WithRawResponse

        fun lists(): ListServiceAsync.WithRawResponse

        fun objectLibrary(): ObjectLibraryServiceAsync.WithRawResponse

        fun objectSchemas(): ObjectSchemaServiceAsync.WithRawResponse

        fun objects(): ObjectServiceAsync.WithRawResponse

        fun owners(): OwnerServiceAsync.WithRawResponse

        fun pipelines(): PipelineServiceAsync.WithRawResponse

        fun properties(): PropertyServiceAsync.WithRawResponse

        fun propertiesValidations(): PropertiesValidationServiceAsync.WithRawResponse
    }
}
