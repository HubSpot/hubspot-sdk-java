// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation.actions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.automation.actions.CollectionResponsePublicActionFunctionIdentifierNoPaging
import com.hubspot_sdk.api.models.automation.actions.PublicActionFunction
import com.hubspot_sdk.api.models.automation.actions.PublicActionFunctionIdentifier
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionArchiveByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionCreateOrReplaceByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionCreateOrReplaceParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionDeleteParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionGetByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionListParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionReadParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FunctionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FunctionService {

    private val withRawResponse: FunctionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FunctionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionService =
        FunctionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: FunctionListParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicActionFunctionIdentifierNoPaging =
        // get /automation/v4/actions/{appId}/{definitionId}/functions
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: FunctionDeleteParams, requestOptions: RequestOptions) {
        // delete
        // /automation/v4/actions/{appId}/{definitionId}/functions/{functionType}/{functionId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun archiveByFunctionType(
        params: FunctionArchiveByFunctionTypeParams,
        requestOptions: RequestOptions,
    ) {
        // delete /automation/v4/actions/{appId}/{definitionId}/functions/{functionType}
        withRawResponse().archiveByFunctionType(params, requestOptions)
    }

    override fun createOrReplace(
        params: FunctionCreateOrReplaceParams,
        requestOptions: RequestOptions,
    ): PublicActionFunctionIdentifier =
        // put /automation/v4/actions/{appId}/{definitionId}/functions/{functionType}/{functionId}
        withRawResponse().createOrReplace(params, requestOptions).parse()

    override fun createOrReplaceByFunctionType(
        params: FunctionCreateOrReplaceByFunctionTypeParams,
        requestOptions: RequestOptions,
    ): PublicActionFunctionIdentifier =
        // put /automation/v4/actions/{appId}/{definitionId}/functions/{functionType}
        withRawResponse().createOrReplaceByFunctionType(params, requestOptions).parse()

    override fun getByFunctionType(
        params: FunctionGetByFunctionTypeParams,
        requestOptions: RequestOptions,
    ): PublicActionFunction =
        // get /automation/v4/actions/{appId}/{definitionId}/functions/{functionType}
        withRawResponse().getByFunctionType(params, requestOptions).parse()

    override fun read(
        params: FunctionReadParams,
        requestOptions: RequestOptions,
    ): PublicActionFunction =
        // get /automation/v4/actions/{appId}/{definitionId}/functions/{functionType}/{functionId}
        withRawResponse().read(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FunctionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FunctionService.WithRawResponse =
            FunctionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponsePublicActionFunctionIdentifierNoPaging> =
            jsonHandler<CollectionResponsePublicActionFunctionIdentifierNoPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: FunctionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicActionFunctionIdentifierNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("definitionId", params.definitionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "v4",
                        "actions",
                        params._pathParam(0),
                        params._pathParam(1),
                        "functions",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: FunctionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "v4",
                        "actions",
                        params._pathParam(0),
                        params._pathParam(1),
                        "functions",
                        params._pathParam(2),
                        params._pathParam(3),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val archiveByFunctionTypeHandler: Handler<Void?> = emptyHandler()

        override fun archiveByFunctionType(
            params: FunctionArchiveByFunctionTypeParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionType", params.functionType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "v4",
                        "actions",
                        params._pathParam(0),
                        params._pathParam(1),
                        "functions",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { archiveByFunctionTypeHandler.handle(it) }
            }
        }

        private val createOrReplaceHandler: Handler<PublicActionFunctionIdentifier> =
            jsonHandler<PublicActionFunctionIdentifier>(clientOptions.jsonMapper)

        override fun createOrReplace(
            params: FunctionCreateOrReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicActionFunctionIdentifier> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "v4",
                        "actions",
                        params._pathParam(0),
                        params._pathParam(1),
                        "functions",
                        params._pathParam(2),
                        params._pathParam(3),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createOrReplaceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createOrReplaceByFunctionTypeHandler: Handler<PublicActionFunctionIdentifier> =
            jsonHandler<PublicActionFunctionIdentifier>(clientOptions.jsonMapper)

        override fun createOrReplaceByFunctionType(
            params: FunctionCreateOrReplaceByFunctionTypeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicActionFunctionIdentifier> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionType", params.functionType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "v4",
                        "actions",
                        params._pathParam(0),
                        params._pathParam(1),
                        "functions",
                        params._pathParam(2),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createOrReplaceByFunctionTypeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getByFunctionTypeHandler: Handler<PublicActionFunction> =
            jsonHandler<PublicActionFunction>(clientOptions.jsonMapper)

        override fun getByFunctionType(
            params: FunctionGetByFunctionTypeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicActionFunction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionType", params.functionType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "v4",
                        "actions",
                        params._pathParam(0),
                        params._pathParam(1),
                        "functions",
                        params._pathParam(2),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getByFunctionTypeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val readHandler: Handler<PublicActionFunction> =
            jsonHandler<PublicActionFunction>(clientOptions.jsonMapper)

        override fun read(
            params: FunctionReadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicActionFunction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "v4",
                        "actions",
                        params._pathParam(0),
                        params._pathParam(1),
                        "functions",
                        params._pathParam(2),
                        params._pathParam(3),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { readHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
