// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.marketing

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.marketing.emails.AggregateEmailStatistics
import com.hubspot.models.marketing.emails.CollectionResponseWithTotalEmailStatisticInterval
import com.hubspot.models.marketing.emails.CollectionResponseWithTotalPublicEmail
import com.hubspot.models.marketing.emails.CollectionResponseWithTotalPublicEmailVersion
import com.hubspot.models.marketing.emails.EmailCloneParams
import com.hubspot.models.marketing.emails.EmailCreateAbTestVariationParams
import com.hubspot.models.marketing.emails.EmailCreateParams
import com.hubspot.models.marketing.emails.EmailDeleteParams
import com.hubspot.models.marketing.emails.EmailGetAbTestVariationParams
import com.hubspot.models.marketing.emails.EmailGetDraftParams
import com.hubspot.models.marketing.emails.EmailGetHistogramParams
import com.hubspot.models.marketing.emails.EmailGetParams
import com.hubspot.models.marketing.emails.EmailGetRevisionParams
import com.hubspot.models.marketing.emails.EmailListPage
import com.hubspot.models.marketing.emails.EmailListParams
import com.hubspot.models.marketing.emails.EmailListRevisionsPage
import com.hubspot.models.marketing.emails.EmailListRevisionsParams
import com.hubspot.models.marketing.emails.EmailPublishParams
import com.hubspot.models.marketing.emails.EmailResetDraftParams
import com.hubspot.models.marketing.emails.EmailRestoreRevisionParams
import com.hubspot.models.marketing.emails.EmailRestoreRevisionToDraftParams
import com.hubspot.models.marketing.emails.EmailUnpublishParams
import com.hubspot.models.marketing.emails.EmailUpdateDraftParams
import com.hubspot.models.marketing.emails.EmailUpdateParams
import com.hubspot.models.marketing.emails.PublicEmail
import com.hubspot.models.marketing.emails.PublicEmailVersion
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EmailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailService {

    private val withRawResponse: EmailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailService =
        EmailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: EmailCreateParams, requestOptions: RequestOptions): PublicEmail =
        // post /marketing/emails/2026-03
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: EmailUpdateParams, requestOptions: RequestOptions): PublicEmail =
        // patch /marketing/emails/2026-03/{emailId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: EmailListParams, requestOptions: RequestOptions): EmailListPage =
        // get /marketing/emails/2026-03
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: EmailDeleteParams, requestOptions: RequestOptions) {
        // delete /marketing/emails/2026-03/{emailId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun clone(params: EmailCloneParams, requestOptions: RequestOptions): PublicEmail =
        // post /marketing/emails/2026-03/clone
        withRawResponse().clone(params, requestOptions).parse()

    override fun createAbTestVariation(
        params: EmailCreateAbTestVariationParams,
        requestOptions: RequestOptions,
    ): PublicEmail =
        // post /marketing/emails/2026-03/ab-test/create-variation
        withRawResponse().createAbTestVariation(params, requestOptions).parse()

    override fun get(
        params: EmailGetParams,
        requestOptions: RequestOptions,
    ): AggregateEmailStatistics =
        // get /marketing/emails/2026-03/statistics/list
        withRawResponse().get(params, requestOptions).parse()

    override fun getAbTestVariation(
        params: EmailGetAbTestVariationParams,
        requestOptions: RequestOptions,
    ): PublicEmail =
        // get /marketing/emails/2026-03/{emailId}/ab-test/get-variation
        withRawResponse().getAbTestVariation(params, requestOptions).parse()

    override fun getDraft(
        params: EmailGetDraftParams,
        requestOptions: RequestOptions,
    ): PublicEmail =
        // get /marketing/emails/2026-03/{emailId}/draft
        withRawResponse().getDraft(params, requestOptions).parse()

    override fun getHistogram(
        params: EmailGetHistogramParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalEmailStatisticInterval =
        // get /marketing/emails/2026-03/statistics/histogram
        withRawResponse().getHistogram(params, requestOptions).parse()

    override fun getRevision(
        params: EmailGetRevisionParams,
        requestOptions: RequestOptions,
    ): PublicEmailVersion =
        // get /marketing/emails/2026-03/{emailId}/revisions/{revisionId}
        withRawResponse().getRevision(params, requestOptions).parse()

    override fun listRevisions(
        params: EmailListRevisionsParams,
        requestOptions: RequestOptions,
    ): EmailListRevisionsPage =
        // get /marketing/emails/2026-03/{emailId}/revisions
        withRawResponse().listRevisions(params, requestOptions).parse()

    override fun publish(params: EmailPublishParams, requestOptions: RequestOptions) {
        // post /marketing/emails/2026-03/{emailId}/publish
        withRawResponse().publish(params, requestOptions)
    }

    override fun resetDraft(params: EmailResetDraftParams, requestOptions: RequestOptions) {
        // post /marketing/emails/2026-03/{emailId}/draft/reset
        withRawResponse().resetDraft(params, requestOptions)
    }

    override fun restoreRevision(
        params: EmailRestoreRevisionParams,
        requestOptions: RequestOptions,
    ) {
        // post /marketing/emails/2026-03/{emailId}/revisions/{revisionId}/restore
        withRawResponse().restoreRevision(params, requestOptions)
    }

    override fun restoreRevisionToDraft(
        params: EmailRestoreRevisionToDraftParams,
        requestOptions: RequestOptions,
    ): PublicEmail =
        // post /marketing/emails/2026-03/{emailId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restoreRevisionToDraft(params, requestOptions).parse()

    override fun unpublish(params: EmailUnpublishParams, requestOptions: RequestOptions) {
        // post /marketing/emails/2026-03/{emailId}/unpublish
        withRawResponse().unpublish(params, requestOptions)
    }

    override fun updateDraft(
        params: EmailUpdateDraftParams,
        requestOptions: RequestOptions,
    ): PublicEmail =
        // patch /marketing/emails/2026-03/{emailId}/draft
        withRawResponse().updateDraft(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailService.WithRawResponse =
            EmailServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun create(
            params: EmailCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicEmail> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "emails", "2026-03")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun update(
            params: EmailUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicEmail> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "emails", "2026-03", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CollectionResponseWithTotalPublicEmail> =
            jsonHandler<CollectionResponseWithTotalPublicEmail>(clientOptions.jsonMapper)

        override fun list(
            params: EmailListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "emails", "2026-03")
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
                    .let {
                        EmailListPage.builder()
                            .service(EmailServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: EmailDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "emails", "2026-03", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val cloneHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun clone(
            params: EmailCloneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicEmail> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "emails", "2026-03", "clone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cloneHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createAbTestVariationHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun createAbTestVariation(
            params: EmailCreateAbTestVariationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicEmail> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        "ab-test",
                        "create-variation",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createAbTestVariationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<AggregateEmailStatistics> =
            jsonHandler<AggregateEmailStatistics>(clientOptions.jsonMapper)

        override fun get(
            params: EmailGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AggregateEmailStatistics> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "emails", "2026-03", "statistics", "list")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getAbTestVariationHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun getAbTestVariation(
            params: EmailGetAbTestVariationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicEmail> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "ab-test",
                        "get-variation",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAbTestVariationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getDraftHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun getDraft(
            params: EmailGetDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicEmail> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "draft",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHistogramHandler:
            Handler<CollectionResponseWithTotalEmailStatisticInterval> =
            jsonHandler<CollectionResponseWithTotalEmailStatisticInterval>(clientOptions.jsonMapper)

        override fun getHistogram(
            params: EmailGetHistogramParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalEmailStatisticInterval> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "emails", "2026-03", "statistics", "histogram")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHistogramHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getRevisionHandler: Handler<PublicEmailVersion> =
            jsonHandler<PublicEmailVersion>(clientOptions.jsonMapper)

        override fun getRevision(
            params: EmailGetRevisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicEmailVersion> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getRevisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listRevisionsHandler: Handler<CollectionResponseWithTotalPublicEmailVersion> =
            jsonHandler<CollectionResponseWithTotalPublicEmailVersion>(clientOptions.jsonMapper)

        override fun listRevisions(
            params: EmailListRevisionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailListRevisionsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "revisions",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRevisionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        EmailListRevisionsPage.builder()
                            .service(EmailServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val publishHandler: Handler<Void?> = emptyHandler()

        override fun publish(
            params: EmailPublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "publish",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { publishHandler.handle(it) }
            }
        }

        private val resetDraftHandler: Handler<Void?> = emptyHandler()

        override fun resetDraft(
            params: EmailResetDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "draft",
                        "reset",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { resetDraftHandler.handle(it) }
            }
        }

        private val restoreRevisionHandler: Handler<Void?> = emptyHandler()

        override fun restoreRevision(
            params: EmailRestoreRevisionParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { restoreRevisionHandler.handle(it) }
            }
        }

        private val restoreRevisionToDraftHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun restoreRevisionToDraft(
            params: EmailRestoreRevisionToDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicEmail> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore-to-draft",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { restoreRevisionToDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unpublishHandler: Handler<Void?> = emptyHandler()

        override fun unpublish(
            params: EmailUnpublishParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "unpublish",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { unpublishHandler.handle(it) }
            }
        }

        private val updateDraftHandler: Handler<PublicEmail> =
            jsonHandler<PublicEmail>(clientOptions.jsonMapper)

        override fun updateDraft(
            params: EmailUpdateDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicEmail> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "emails",
                        "2026-03",
                        params._pathParam(0),
                        "draft",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
