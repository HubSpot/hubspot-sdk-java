// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async

import com.hubspot.core.ClientOptions
import com.hubspot.services.async.crm.AppUninstallServiceAsync
import com.hubspot.services.async.crm.AppUninstallServiceAsyncImpl
import com.hubspot.services.async.crm.AssociationServiceAsync
import com.hubspot.services.async.crm.AssociationServiceAsyncImpl
import com.hubspot.services.async.crm.AssociationsSchemaServiceAsync
import com.hubspot.services.async.crm.AssociationsSchemaServiceAsyncImpl
import com.hubspot.services.async.crm.DealSplitServiceAsync
import com.hubspot.services.async.crm.DealSplitServiceAsyncImpl
import com.hubspot.services.async.crm.ExportServiceAsync
import com.hubspot.services.async.crm.ExportServiceAsyncImpl
import com.hubspot.services.async.crm.ExtensionServiceAsync
import com.hubspot.services.async.crm.ExtensionServiceAsyncImpl
import com.hubspot.services.async.crm.FeatureFlagServiceAsync
import com.hubspot.services.async.crm.FeatureFlagServiceAsyncImpl
import com.hubspot.services.async.crm.ImportServiceAsync
import com.hubspot.services.async.crm.ImportServiceAsyncImpl
import com.hubspot.services.async.crm.LimitServiceAsync
import com.hubspot.services.async.crm.LimitServiceAsyncImpl
import com.hubspot.services.async.crm.ListServiceAsync
import com.hubspot.services.async.crm.ListServiceAsyncImpl
import com.hubspot.services.async.crm.ObjectLibraryServiceAsync
import com.hubspot.services.async.crm.ObjectLibraryServiceAsyncImpl
import com.hubspot.services.async.crm.ObjectSchemaServiceAsync
import com.hubspot.services.async.crm.ObjectSchemaServiceAsyncImpl
import com.hubspot.services.async.crm.ObjectServiceAsync
import com.hubspot.services.async.crm.ObjectServiceAsyncImpl
import com.hubspot.services.async.crm.OwnerServiceAsync
import com.hubspot.services.async.crm.OwnerServiceAsyncImpl
import com.hubspot.services.async.crm.PipelineServiceAsync
import com.hubspot.services.async.crm.PipelineServiceAsyncImpl
import com.hubspot.services.async.crm.PropertiesValidationServiceAsync
import com.hubspot.services.async.crm.PropertiesValidationServiceAsyncImpl
import com.hubspot.services.async.crm.PropertyServiceAsync
import com.hubspot.services.async.crm.PropertyServiceAsyncImpl
import com.hubspot.services.async.crm.TimelineServiceAsync
import com.hubspot.services.async.crm.TimelineServiceAsyncImpl
import java.util.function.Consumer

class CrmServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CrmServiceAsync {

    private val withRawResponse: CrmServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val appUninstalls: AppUninstallServiceAsync by lazy {
        AppUninstallServiceAsyncImpl(clientOptions)
    }

    private val associations: AssociationServiceAsync by lazy {
        AssociationServiceAsyncImpl(clientOptions)
    }

    private val associationsSchema: AssociationsSchemaServiceAsync by lazy {
        AssociationsSchemaServiceAsyncImpl(clientOptions)
    }

    private val dealSplits: DealSplitServiceAsync by lazy {
        DealSplitServiceAsyncImpl(clientOptions)
    }

    private val exports: ExportServiceAsync by lazy { ExportServiceAsyncImpl(clientOptions) }

    private val extensions: ExtensionServiceAsync by lazy {
        ExtensionServiceAsyncImpl(clientOptions)
    }

    private val featureFlags: FeatureFlagServiceAsync by lazy {
        FeatureFlagServiceAsyncImpl(clientOptions)
    }

    private val imports: ImportServiceAsync by lazy { ImportServiceAsyncImpl(clientOptions) }

    private val limits: LimitServiceAsync by lazy { LimitServiceAsyncImpl(clientOptions) }

    private val lists: ListServiceAsync by lazy { ListServiceAsyncImpl(clientOptions) }

    private val objectLibrary: ObjectLibraryServiceAsync by lazy {
        ObjectLibraryServiceAsyncImpl(clientOptions)
    }

    private val objectSchemas: ObjectSchemaServiceAsync by lazy {
        ObjectSchemaServiceAsyncImpl(clientOptions)
    }

    private val objects: ObjectServiceAsync by lazy { ObjectServiceAsyncImpl(clientOptions) }

    private val owners: OwnerServiceAsync by lazy { OwnerServiceAsyncImpl(clientOptions) }

    private val pipelines: PipelineServiceAsync by lazy { PipelineServiceAsyncImpl(clientOptions) }

    private val properties: PropertyServiceAsync by lazy { PropertyServiceAsyncImpl(clientOptions) }

    private val propertiesValidations: PropertiesValidationServiceAsync by lazy {
        PropertiesValidationServiceAsyncImpl(clientOptions)
    }

    private val timeline: TimelineServiceAsync by lazy { TimelineServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CrmServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrmServiceAsync =
        CrmServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun appUninstalls(): AppUninstallServiceAsync = appUninstalls

    override fun associations(): AssociationServiceAsync = associations

    override fun associationsSchema(): AssociationsSchemaServiceAsync = associationsSchema

    override fun dealSplits(): DealSplitServiceAsync = dealSplits

    override fun exports(): ExportServiceAsync = exports

    override fun extensions(): ExtensionServiceAsync = extensions

    override fun featureFlags(): FeatureFlagServiceAsync = featureFlags

    override fun imports(): ImportServiceAsync = imports

    override fun limits(): LimitServiceAsync = limits

    override fun lists(): ListServiceAsync = lists

    override fun objectLibrary(): ObjectLibraryServiceAsync = objectLibrary

    override fun objectSchemas(): ObjectSchemaServiceAsync = objectSchemas

    override fun objects(): ObjectServiceAsync = objects

    override fun owners(): OwnerServiceAsync = owners

    override fun pipelines(): PipelineServiceAsync = pipelines

    override fun properties(): PropertyServiceAsync = properties

    override fun propertiesValidations(): PropertiesValidationServiceAsync = propertiesValidations

    override fun timeline(): TimelineServiceAsync = timeline

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CrmServiceAsync.WithRawResponse {

        private val appUninstalls: AppUninstallServiceAsync.WithRawResponse by lazy {
            AppUninstallServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val associations: AssociationServiceAsync.WithRawResponse by lazy {
            AssociationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val associationsSchema: AssociationsSchemaServiceAsync.WithRawResponse by lazy {
            AssociationsSchemaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dealSplits: DealSplitServiceAsync.WithRawResponse by lazy {
            DealSplitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val exports: ExportServiceAsync.WithRawResponse by lazy {
            ExportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val extensions: ExtensionServiceAsync.WithRawResponse by lazy {
            ExtensionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val featureFlags: FeatureFlagServiceAsync.WithRawResponse by lazy {
            FeatureFlagServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val imports: ImportServiceAsync.WithRawResponse by lazy {
            ImportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val limits: LimitServiceAsync.WithRawResponse by lazy {
            LimitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val lists: ListServiceAsync.WithRawResponse by lazy {
            ListServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val objectLibrary: ObjectLibraryServiceAsync.WithRawResponse by lazy {
            ObjectLibraryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val objectSchemas: ObjectSchemaServiceAsync.WithRawResponse by lazy {
            ObjectSchemaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val objects: ObjectServiceAsync.WithRawResponse by lazy {
            ObjectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val owners: OwnerServiceAsync.WithRawResponse by lazy {
            OwnerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val pipelines: PipelineServiceAsync.WithRawResponse by lazy {
            PipelineServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val properties: PropertyServiceAsync.WithRawResponse by lazy {
            PropertyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val propertiesValidations:
            PropertiesValidationServiceAsync.WithRawResponse by lazy {
            PropertiesValidationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val timeline: TimelineServiceAsync.WithRawResponse by lazy {
            TimelineServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CrmServiceAsync.WithRawResponse =
            CrmServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun appUninstalls(): AppUninstallServiceAsync.WithRawResponse = appUninstalls

        override fun associations(): AssociationServiceAsync.WithRawResponse = associations

        override fun associationsSchema(): AssociationsSchemaServiceAsync.WithRawResponse =
            associationsSchema

        override fun dealSplits(): DealSplitServiceAsync.WithRawResponse = dealSplits

        override fun exports(): ExportServiceAsync.WithRawResponse = exports

        override fun extensions(): ExtensionServiceAsync.WithRawResponse = extensions

        override fun featureFlags(): FeatureFlagServiceAsync.WithRawResponse = featureFlags

        override fun imports(): ImportServiceAsync.WithRawResponse = imports

        override fun limits(): LimitServiceAsync.WithRawResponse = limits

        override fun lists(): ListServiceAsync.WithRawResponse = lists

        override fun objectLibrary(): ObjectLibraryServiceAsync.WithRawResponse = objectLibrary

        override fun objectSchemas(): ObjectSchemaServiceAsync.WithRawResponse = objectSchemas

        override fun objects(): ObjectServiceAsync.WithRawResponse = objects

        override fun owners(): OwnerServiceAsync.WithRawResponse = owners

        override fun pipelines(): PipelineServiceAsync.WithRawResponse = pipelines

        override fun properties(): PropertyServiceAsync.WithRawResponse = properties

        override fun propertiesValidations(): PropertiesValidationServiceAsync.WithRawResponse =
            propertiesValidations

        override fun timeline(): TimelineServiceAsync.WithRawResponse = timeline
    }
}
