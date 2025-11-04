// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.marketing.emails.CollectionResponseWithTotalPublicEmailForwardPaging
import com.hubspot_sdk.api.models.marketing.emails.CollectionResponseWithTotalVersionPublicEmail
import com.hubspot_sdk.api.models.marketing.emails.EmailCloneParams
import com.hubspot_sdk.api.models.marketing.emails.EmailCreateAbTestVariationParams
import com.hubspot_sdk.api.models.marketing.emails.EmailCreateParams
import com.hubspot_sdk.api.models.marketing.emails.EmailDeleteParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetAbTestVariationParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetDraftParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetParams
import com.hubspot_sdk.api.models.marketing.emails.EmailGetRevisionParams
import com.hubspot_sdk.api.models.marketing.emails.EmailListPageAsync
import com.hubspot_sdk.api.models.marketing.emails.EmailListParams
import com.hubspot_sdk.api.models.marketing.emails.EmailListRevisionsPageAsync
import com.hubspot_sdk.api.models.marketing.emails.EmailListRevisionsParams
import com.hubspot_sdk.api.models.marketing.emails.EmailPublishParams
import com.hubspot_sdk.api.models.marketing.emails.EmailResetDraftParams
import com.hubspot_sdk.api.models.marketing.emails.EmailRestoreRevisionParams
import com.hubspot_sdk.api.models.marketing.emails.EmailRestoreRevisionToDraftParams
import com.hubspot_sdk.api.models.marketing.emails.EmailUnpublishParams
import com.hubspot_sdk.api.models.marketing.emails.EmailUpdateDraftParams
import com.hubspot_sdk.api.models.marketing.emails.EmailUpdateParams
import com.hubspot_sdk.api.models.marketing.emails.PublicEmail
import com.hubspot_sdk.api.models.marketing.emails.VersionPublicEmail
import com.hubspot_sdk.api.services.async.marketing.emails.StatisticServiceAsync
import com.hubspot_sdk.api.services.async.marketing.emails.StatisticServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EmailServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailServiceAsync {

    private val withRawResponse: EmailServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val statistics: StatisticServiceAsync by lazy {
        StatisticServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): EmailServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailServiceAsync =
        EmailServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun statistics(): StatisticServiceAsync = statistics

    override fun create(
        params: EmailCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // post /marketing/v3/emails/
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: EmailUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // patch /marketing/v3/emails/{emailId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EmailListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailListPageAsync> =
        // get /marketing/v3/emails/
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EmailDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /marketing/v3/emails/{emailId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun clone(
        params: EmailCloneParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // post /marketing/v3/emails/clone
        withRawResponse().clone(params, requestOptions).thenApply { it.parse() }

    override fun createAbTestVariation(
        params: EmailCreateAbTestVariationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // post /marketing/v3/emails/ab-test/create-variation
        withRawResponse().createAbTestVariation(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: EmailGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // get /marketing/v3/emails/{emailId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getAbTestVariation(
        params: EmailGetAbTestVariationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // get /marketing/v3/emails/{emailId}/ab-test/get-variation
        withRawResponse().getAbTestVariation(params, requestOptions).thenApply { it.parse() }

    override fun getDraft(
        params: EmailGetDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // get /marketing/v3/emails/{emailId}/draft
        withRawResponse().getDraft(params, requestOptions).thenApply { it.parse() }

    override fun getRevision(
        params: EmailGetRevisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VersionPublicEmail> =
        // get /marketing/v3/emails/{emailId}/revisions/{revisionId}
        withRawResponse().getRevision(params, requestOptions).thenApply { it.parse() }

    override fun listRevisions(
        params: EmailListRevisionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailListRevisionsPageAsync> =
        // get /marketing/v3/emails/{emailId}/revisions
        withRawResponse().listRevisions(params, requestOptions).thenApply { it.parse() }

    override fun publish(
        params: EmailPublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /marketing/v3/emails/{emailId}/publish
        withRawResponse().publish(params, requestOptions).thenAccept {}

    override fun resetDraft(
        params: EmailResetDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /marketing/v3/emails/{emailId}/draft/reset
        withRawResponse().resetDraft(params, requestOptions).thenAccept {}

    override fun restoreRevision(
        params: EmailRestoreRevisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /marketing/v3/emails/{emailId}/revisions/{revisionId}/restore
        withRawResponse().restoreRevision(params, requestOptions).thenAccept {}

    override fun restoreRevisionToDraft(
        params: EmailRestoreRevisionToDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // post /marketing/v3/emails/{emailId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restoreRevisionToDraft(params, requestOptions).thenApply { it.parse() }

    override fun unpublish(
        params: EmailUnpublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /marketing/v3/emails/{emailId}/unpublish
        withRawResponse().unpublish(params, requestOptions).thenAccept {}

    override fun updateDraft(
        params: EmailUpdateDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicEmail> =
        // patch /marketing/v3/emails/{emailId}/draft
        withRawResponse().updateDraft(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val statistics: StatisticServiceAsync.WithRawResponse by lazy {
            StatisticServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailServiceAsync.WithRawResponse =
            EmailServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun statistics(): StatisticServiceAsync.WithRawResponse = statistics

        private val createHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun create(
            params: EmailCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun update(
            params: EmailUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CollectionResponseWithTotalPublicEmailForwardPaging> =
            jsonHandler<CollectionResponseWithTotalPublicEmailForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: EmailListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                EmailListPageAsync.builder()
                                    .service(EmailServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: EmailDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val cloneHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun clone(
            params: EmailCloneParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", "clone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cloneHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createAbTestVariationHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun createAbTestVariation(
            params: EmailCreateAbTestVariationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", "ab-test", "create-variation")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createAbTestVariationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun get(
            params: EmailGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getAbTestVariationHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun getAbTestVariation(
            params: EmailGetAbTestVariationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "emails",
                        params._pathParam(0),
                        "ab-test",
                        "get-variation",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAbTestVariationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getDraftHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun getDraft(
            params: EmailGetDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", params._pathParam(0), "draft")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getRevisionHandler: Handler<VersionPublicEmail> =
            jsonHandler<VersionPublicEmail>(clientOptions.jsonMapper)

        override fun getRevision(
            params: EmailGetRevisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VersionPublicEmail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "emails",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getRevisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listRevisionsHandler: Handler<CollectionResponseWithTotalVersionPublicEmail> =
            jsonHandler<CollectionResponseWithTotalVersionPublicEmail>(clientOptions.jsonMapper)

        override fun listRevisions(
            params: EmailListRevisionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailListRevisionsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", params._pathParam(0), "revisions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listRevisionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                EmailListRevisionsPageAsync.builder()
                                    .service(EmailServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val publishHandler: Handler<Void?> = emptyHandler()

        override fun publish(
            params: EmailPublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", params._pathParam(0), "publish")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { publishHandler.handle(it) }
                    }
                }
        }

        private val resetDraftHandler: Handler<Void?> = emptyHandler()

        override fun resetDraft(
            params: EmailResetDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "emails",
                        params._pathParam(0),
                        "draft",
                        "reset",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { resetDraftHandler.handle(it) }
                    }
                }
        }

        private val restoreRevisionHandler: Handler<Void?> = emptyHandler()

        override fun restoreRevision(
            params: EmailRestoreRevisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "emails",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { restoreRevisionHandler.handle(it) }
                    }
                }
        }

        private val restoreRevisionToDraftHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun restoreRevisionToDraft(
            params: EmailRestoreRevisionToDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "emails",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore-to-draft",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { restoreRevisionToDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unpublishHandler: Handler<Void?> = emptyHandler()

        override fun unpublish(
            params: EmailUnpublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", params._pathParam(0), "unpublish")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { unpublishHandler.handle(it) }
                    }
                }
        }

        private val updateDraftHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun updateDraft(
            params: EmailUpdateDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicEmail>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "emails", params._pathParam(0), "draft")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
