// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.crm.limits.AssociationRecordLimitResponse
import com.hubspot_sdk.api.models.crm.limits.CalculatedPropertyLimitResponse
import com.hubspot_sdk.api.models.crm.limits.CollectionResponseAssociationLabelLimitResponseNoPaging
import com.hubspot_sdk.api.models.crm.limits.CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging
import com.hubspot_sdk.api.models.crm.limits.CustomObjectLimitResponse
import com.hubspot_sdk.api.models.crm.limits.CustomPropertyLimitResponse
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationLabelLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationRecordsLimitsByObjectTypeParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationRecordsLimitsFromObjectsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetAssociationRecordsLimitsToObjectsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetCalculatedPropertyLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetCustomObjectTypeLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetCustomPropertyLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetPipelineLimitsParams
import com.hubspot_sdk.api.models.crm.limits.LimitGetRecordLimitsParams
import com.hubspot_sdk.api.models.crm.limits.PipelineLimitResponse
import com.hubspot_sdk.api.models.crm.limits.RecordLimitResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LimitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LimitService {

    private val withRawResponse: LimitService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LimitService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LimitService =
        LimitServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getAssociationLabelLimits(
        params: LimitGetAssociationLabelLimitsParams,
        requestOptions: RequestOptions,
    ): CollectionResponseAssociationLabelLimitResponseNoPaging =
        // get /crm/v3/limits/associations/labels
        withRawResponse().getAssociationLabelLimits(params, requestOptions).parse()

    override fun getAssociationRecordsLimitsByObjectType(
        params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
        requestOptions: RequestOptions,
    ): AssociationRecordLimitResponse =
        // get /crm/v3/limits/associations/records/{fromObjectTypeId}/{toObjectTypeId}
        withRawResponse().getAssociationRecordsLimitsByObjectType(params, requestOptions).parse()

    override fun getAssociationRecordsLimitsFromObjects(
        params: LimitGetAssociationRecordsLimitsFromObjectsParams,
        requestOptions: RequestOptions,
    ): CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
        // get /crm/v3/limits/associations/records/from
        withRawResponse().getAssociationRecordsLimitsFromObjects(params, requestOptions).parse()

    override fun getAssociationRecordsLimitsToObjects(
        params: LimitGetAssociationRecordsLimitsToObjectsParams,
        requestOptions: RequestOptions,
    ): CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging =
        // get /crm/v3/limits/associations/records/{fromObjectTypeId}/to
        withRawResponse().getAssociationRecordsLimitsToObjects(params, requestOptions).parse()

    override fun getCalculatedPropertyLimits(
        params: LimitGetCalculatedPropertyLimitsParams,
        requestOptions: RequestOptions,
    ): CalculatedPropertyLimitResponse =
        // get /crm/v3/limits/calculated-properties
        withRawResponse().getCalculatedPropertyLimits(params, requestOptions).parse()

    override fun getCustomObjectTypeLimits(
        params: LimitGetCustomObjectTypeLimitsParams,
        requestOptions: RequestOptions,
    ): CustomObjectLimitResponse =
        // get /crm/v3/limits/custom-object-types
        withRawResponse().getCustomObjectTypeLimits(params, requestOptions).parse()

    override fun getCustomPropertyLimits(
        params: LimitGetCustomPropertyLimitsParams,
        requestOptions: RequestOptions,
    ): CustomPropertyLimitResponse =
        // get /crm/v3/limits/custom-properties
        withRawResponse().getCustomPropertyLimits(params, requestOptions).parse()

    override fun getPipelineLimits(
        params: LimitGetPipelineLimitsParams,
        requestOptions: RequestOptions,
    ): PipelineLimitResponse =
        // get /crm/v3/limits/pipelines
        withRawResponse().getPipelineLimits(params, requestOptions).parse()

    override fun getRecordLimits(
        params: LimitGetRecordLimitsParams,
        requestOptions: RequestOptions,
    ): RecordLimitResponse =
        // get /crm/v3/limits/records
        withRawResponse().getRecordLimits(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LimitService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LimitService.WithRawResponse =
            LimitServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getAssociationLabelLimitsHandler:
            Handler<CollectionResponseAssociationLabelLimitResponseNoPaging> =
            jsonHandler<CollectionResponseAssociationLabelLimitResponseNoPaging>(
                clientOptions.jsonMapper
            )

        override fun getAssociationLabelLimits(
            params: LimitGetAssociationLabelLimitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseAssociationLabelLimitResponseNoPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "limits", "associations", "labels")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAssociationLabelLimitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getAssociationRecordsLimitsByObjectTypeHandler:
            Handler<AssociationRecordLimitResponse> =
            jsonHandler<AssociationRecordLimitResponse>(clientOptions.jsonMapper)

        override fun getAssociationRecordsLimitsByObjectType(
            params: LimitGetAssociationRecordsLimitsByObjectTypeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssociationRecordLimitResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectTypeId", params.toObjectTypeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "limits",
                        "associations",
                        "records",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAssociationRecordsLimitsByObjectTypeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getAssociationRecordsLimitsFromObjectsHandler:
            Handler<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
            jsonHandler<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>(
                clientOptions.jsonMapper
            )

        override fun getAssociationRecordsLimitsFromObjects(
            params: LimitGetAssociationRecordsLimitsFromObjectsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "limits", "associations", "records", "from")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAssociationRecordsLimitsFromObjectsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getAssociationRecordsLimitsToObjectsHandler:
            Handler<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> =
            jsonHandler<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging>(
                clientOptions.jsonMapper
            )

        override fun getAssociationRecordsLimitsToObjects(
            params: LimitGetAssociationRecordsLimitsToObjectsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseObjectTypeNearOrAtAssociationLimitNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fromObjectTypeId", params.fromObjectTypeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "limits",
                        "associations",
                        "records",
                        params._pathParam(0),
                        "to",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAssociationRecordsLimitsToObjectsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getCalculatedPropertyLimitsHandler: Handler<CalculatedPropertyLimitResponse> =
            jsonHandler<CalculatedPropertyLimitResponse>(clientOptions.jsonMapper)

        override fun getCalculatedPropertyLimits(
            params: LimitGetCalculatedPropertyLimitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CalculatedPropertyLimitResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "limits", "calculated-properties")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getCalculatedPropertyLimitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getCustomObjectTypeLimitsHandler: Handler<CustomObjectLimitResponse> =
            jsonHandler<CustomObjectLimitResponse>(clientOptions.jsonMapper)

        override fun getCustomObjectTypeLimits(
            params: LimitGetCustomObjectTypeLimitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomObjectLimitResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "limits", "custom-object-types")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getCustomObjectTypeLimitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getCustomPropertyLimitsHandler: Handler<CustomPropertyLimitResponse> =
            jsonHandler<CustomPropertyLimitResponse>(clientOptions.jsonMapper)

        override fun getCustomPropertyLimits(
            params: LimitGetCustomPropertyLimitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomPropertyLimitResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "limits", "custom-properties")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getCustomPropertyLimitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getPipelineLimitsHandler: Handler<PipelineLimitResponse> =
            jsonHandler<PipelineLimitResponse>(clientOptions.jsonMapper)

        override fun getPipelineLimits(
            params: LimitGetPipelineLimitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PipelineLimitResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "limits", "pipelines")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getPipelineLimitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getRecordLimitsHandler: Handler<RecordLimitResponse> =
            jsonHandler<RecordLimitResponse>(clientOptions.jsonMapper)

        override fun getRecordLimits(
            params: LimitGetRecordLimitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordLimitResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "limits", "records")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getRecordLimitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
